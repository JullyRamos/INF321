package br.unicamp.comprefacil.dao;

import br.unicamp.comprefacil.model.Endereco;

public interface DadosDeEntregaDAO {

	public Endereco getEnderecoEntrega(String cep);
	public void saveDadosDeEntrega(Double valorFrete, Integer diasEntrega);
	
}
