package br.unicamp.comprefacil.services;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;

import br.unicamp.comprefacil.dao.DadosDeEntregaDAO;
import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;
import br.unicamp.comprefacil.model.Pedido;

public class CorreiosServices {
	
	private boolean on;
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
		if(!isOn())
			throw new Throwable("CorreioServices is offline right now");

		Frete f = calculateShipping(p.getPeso(), p.getLargura(), p.getAltura(), p.getComprimento(), p.getTipoEntrega(), p.getCep());
		dao.saveDadosDeEntrega(f.getValor(), f.getTempoEntrega());
		return f;
	}
	
	private Frete calculateShipping(int peso, int largura, int altura,
			int comprimento, String tipoEntrega, String cep) throws Throwable{

		Frete frete = null;
		if (cep.equalsIgnoreCase("04119010")) {
			
			int valor = 0;
			int tempoEntrega = 0;
			if(tipoEntrega.equals("PAC") && cep.equals("04119010")){
				valor = 5;
				tempoEntrega = 5;
			} else if(tipoEntrega.equals("SEDEX") && cep.equals("04119010")){
				valor = 20;
				tempoEntrega = 3;
			} else if(tipoEntrega.equals("SEDEX10") && cep.equals("04119010")){
				valor = 100;
				tempoEntrega = 1;
			}
			
			ResponseDefinitionBuilder builder = aResponse()
	                .withHeader("Content-Type", "text/plain")
	                .withBody("{\"Valor\":\""+valor+"\",\"PrazoEntrega\":\""+tempoEntrega+"\"}");
			ResponseDefinition resp = builder.build();
			
			JSONObject json = (JSONObject) new JSONParser().parse(resp.getBody());
			
			String valorResp = json.get("Valor").toString();
			String tempoEntregaResp = json.get("PrazoEntrega").toString();
			
			frete = new Frete();
			frete.setTempoEntrega(Integer.valueOf(tempoEntregaResp));
			frete.setValor(Double.valueOf(valorResp));
		} else {
			throw new Throwable("The zipcode is not valid");
	    }

		return frete;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
}
