package br.unicamp.comprefacil.services;

import br.unicamp.comprefacil.dao.CorreiosDAO;
import br.unicamp.comprefacil.dao.CorreiosDAOImpl;
import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;

public class CorreiosServices {
	
	private boolean on;
	
	public Endereco getEndereco(String cep) throws Throwable {
		
		CorreiosDAO correiosDAO = new CorreiosDAOImpl();
		
		return correiosDAO.getAddress(cep);
	}
	
	public Boolean validaCep(String cep) { 
		
		CorreiosDAO correiosDAO = new CorreiosDAOImpl();
		
		return correiosDAO.validCep(cep);
	}
	
	public Frete calculaFrete(int peso, int largura, int altura, int comprimento, String tipoEntrega, String cep) throws Throwable {
		if(!isOn())
			throw new Throwable("CorreioServices is offline right now");
		
		CorreiosDAO correiosDAO = new CorreiosDAOImpl();
		
		return correiosDAO.calculateShipping(peso, largura, altura, comprimento, tipoEntrega, cep);
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
}
