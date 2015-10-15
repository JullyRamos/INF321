package br.unicamp.comprefacil.dao;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;

public class CorreiosDAOImpl implements CorreiosDAO {

	public Boolean validCep(String cep) {
		if(cep.matches("\\d{8}")){
			return true;
		}
		return false;
	}

	public Endereco getAddress(String cep) throws Throwable{

		Endereco endereco = null;
		if(validCep(cep)){
			if (cep.equalsIgnoreCase("04119010")) {
				
				ResponseDefinitionBuilder builder = aResponse()
		                .withHeader("Content-Type", "text/plain")
		                .withBody("{\"Endereco\":\"Rua Conde de Iraja\",\"Bairro\":\"Vila Mariana\",\"Cidade\":\"Sao Paulo\",\"Estado\":\"SP\"}");
				ResponseDefinition resp = builder.build();
				
				JSONObject json = (JSONObject) new JSONParser().parse(resp.getBody());
				
				endereco = new Endereco();
				endereco.setLogradouro(json.get("Endereco").toString());
				endereco.setBairro(json.get("Bairro").toString());
				endereco.setCidade(json.get("Cidade").toString());
				endereco.setEstado(json.get("Estado").toString());
			} else {
				throw new Throwable("The address is not valid");
		    }
		} else{
			throw new Throwable("The zipcode is not valid");
		}
		
		return endereco;
	}

	public Frete calculateShipping(int peso, int largura, int altura,
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
}
