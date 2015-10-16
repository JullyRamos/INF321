package br.unicamp.comprefacil.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.unicamp.comprefacil.dao.DadosDeEntregaDAO;
import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;
import br.unicamp.comprefacil.model.Pedido;

public class CorreiosServices {
	private DadosDeEntregaDAO dao;
	
	public CorreiosServices(DadosDeEntregaDAO dao){
		this.dao = dao;
	}
	
	public Endereco getEndereco(String cep) throws Throwable {
		if(validaCep(cep)) {
			return dao.getEnderecoEntrega(cep);
		} else {
			throw new Throwable("The zipcode is not valid");
		}
	}
	
	public Boolean validaCep(String cep) { 
		if(cep.matches("\\d{8}")){
			return true;
		}
		return false;
	}
	
	public Frete calculaFrete(Pedido p) throws Throwable {
		Frete frete = null;
		
		URL obj = new URL("http://localhost:8090/calcularFrete?peso="+p.getPeso()+"&largura="+p.getLargura()+
				"&comprimento="+p.getComprimento()+"&tipoEntrega="+p.getTipoEntrega()+"&cep="+p.getCep());
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();

		if(responseCode == 200) {
			BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			JSONObject json = (JSONObject) new JSONParser().parse(response.toString());
		
			String valorResp = json.get("Valor").toString();
			String tempoEntregaResp = json.get("PrazoEntrega").toString();
		
			frete = new Frete();
			frete.setTempoEntrega(Integer.valueOf(tempoEntregaResp));
			frete.setValor(Double.valueOf(valorResp));
		
			dao.saveDadosDeEntrega(frete.getValor(), frete.getTempoEntrega());
		} else if(responseCode == 400){
			throw new Throwable("The zipcode is not valid");
		} else if(responseCode == 500){
			throw new Throwable("CorreioServices is offline right now");
		}
		return frete;
	}
}
