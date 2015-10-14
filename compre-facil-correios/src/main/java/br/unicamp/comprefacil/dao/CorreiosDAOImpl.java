package br.unicamp.comprefacil.dao;

import java.math.BigDecimal;

import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;

public class CorreiosDAOImpl implements CorreiosDAO {

	public Boolean validCep(String cep) {

		return Boolean.TRUE;
	}

	public Endereco getAddress(String cep) throws Throwable{

		Endereco endereco = null;
		if (cep.equalsIgnoreCase("04119010")) {
			endereco = new Endereco();
			endereco.setLogradouro("Rua Conde de Iraja");
			endereco.setBairro("Vila Mariana");
			endereco.setCidade("Sao Paulo");
			endereco.setEstado("SP");
		} else {
			throw new Throwable("The address is not valid");
	    }
		return endereco;

	}

	public Frete calculateShipping(int peso, int largura, int altura,
			int comprimento, String tipoEntrega, String cep) throws Throwable{

		Frete frete = null;
		if (cep.equalsIgnoreCase("04119010")) {
			frete = new Frete();
			if(tipoEntrega.equalsIgnoreCase("PAC")) {
				frete.setTempoEntrega(5);
				frete.setValor(new BigDecimal(5));
			} else if(tipoEntrega.equalsIgnoreCase("SEDEX")) {
				frete.setTempoEntrega(3);
				frete.setValor(new BigDecimal(20));
			} else if(tipoEntrega.equalsIgnoreCase("SEDEX10")) {
				frete.setTempoEntrega(1);
				frete.setValor(new BigDecimal(100));
			}
		} else {
			throw new Throwable("The zipcode is not valid");
	    }

		return frete;
	}
}
