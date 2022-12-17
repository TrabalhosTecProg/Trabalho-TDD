package org.tppe.tp1.entities;
import java.time.LocalDate;

public class Dependente {
	
	private String nome;	
	private LocalDate data ;
	
	public Dependente() {}
	public Dependente(String nome, LocalDate data) {
		this.nome= nome;
		this.data= data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome){

		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
