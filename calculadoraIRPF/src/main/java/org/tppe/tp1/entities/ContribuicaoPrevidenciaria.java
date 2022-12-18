package org.tppe.tp1.entities;

public class ContribuicaoPrevidenciaria {

	private String descricao;	
	private double valor ;
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ContribuicaoPrevidenciaria() {
		super();
	}
	public ContribuicaoPrevidenciaria(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
