package org.tppe.tp1.entities;
import java.time.LocalDate;

import org.tppe.tp1.exceptions.NomeEmBrancoException;


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

	public void setNome(String nome) throws NomeEmBrancoException {
		 if (nome==null||nome.isEmpty() || nome.isBlank()) 
	            throw new NomeEmBrancoException(
	                "Nome de dependente não pode estar em branco!"); 
		 this.nome= nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
