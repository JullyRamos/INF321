package br.unicamp.comprefacil.dao;

import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;

public interface CorreiosDAO {
	
	public Boolean validCep(String cep);
	
	public Endereco getAddress(String cep) throws Throwable;

	public Frete calculateShipping(int peso, int largura, int altura, int comprimento, String tipoEntrega, String cep) throws Throwable;

}
