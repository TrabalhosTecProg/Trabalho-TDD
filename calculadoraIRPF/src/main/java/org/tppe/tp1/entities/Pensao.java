package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;
import org.tppe.tp1.utils.Limite;

public class Pensao {

	private double valor;
	private Limite limite = new Limite();
	
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
		if (!(limite.isLimiteValido(valor))) {
	        throw new ValorPensaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	    }
		this.valor = valor;
	}
}
