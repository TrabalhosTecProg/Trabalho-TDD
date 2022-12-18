package org.tppe.tp1.entities;


public class Deducao {
	private String descricao;	
	private double valor ;
	
	public Deducao() {}
	public Deducao(String descricao, double valor) {
		this.descricao= descricao;
		this.valor= valor;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		 this.descricao= descricao;
	}

	public double getvalor() {
		return valor;
	}

	public void setvalor(double valor) {
		this.valor = valor;
	}
}
