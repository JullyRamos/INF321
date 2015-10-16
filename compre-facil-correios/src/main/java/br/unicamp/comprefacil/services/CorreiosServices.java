package br.unicamp.comprefacil.services;

import br.unicamp.comprefacil.dao.CorreiosDAO;
import br.unicamp.comprefacil.dao.CorreiosDAOImpl;
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
		
		CorreiosDAO correiosDAO = new CorreiosDAOImpl();
		Frete f = correiosDAO.calculateShipping(p.getPeso(), p.getLargura(), p.getAltura(), p.getComprimento(), p.getTipoEntrega(), p.getCep());
		dao.saveDadosDeEntrega(f.getValor(), f.getTempoEntrega());
		return f;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
}
