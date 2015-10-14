package br.unicamp.comprefacil.model;

import java.math.BigDecimal;

public class Frete {
	
	private int tempoEntrega;
	private BigDecimal valor;
	
	public int getTempoEntrega() {
		return tempoEntrega;
	}
	
	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
