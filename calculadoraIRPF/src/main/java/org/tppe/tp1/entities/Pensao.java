package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;

public class Pensao {

	private double valor;
	
	public Pensao() {
		super();
	}
	
	public Pensao(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor)  throws ValorPensaoInvalidoException{
		if (!(isLimiteValido(valor))) {
	        throw new ValorPensaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	    }
		this.valor = valor;
	}
	
	private Boolean isLimiteValido(Double valor) {
	       return (valor > 0.0D && valor < Double.MAX_VALUE);
	}
	
}
