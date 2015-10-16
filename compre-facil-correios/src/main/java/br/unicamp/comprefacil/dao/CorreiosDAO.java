package br.unicamp.comprefacil.dao;

import br.unicamp.comprefacil.model.Frete;

public interface CorreiosDAO {
	public Frete calculateShipping(int peso, int largura, int altura, int comprimento, String tipoEntrega, String cep) throws Throwable;

}
