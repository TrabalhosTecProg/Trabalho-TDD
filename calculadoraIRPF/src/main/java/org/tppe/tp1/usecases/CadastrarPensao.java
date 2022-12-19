package org.tppe.tp1.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.exceptions.CadastroInvalidoException;

public class CadastrarPensao {
	
	List<Pensao> pensoes;
	public double totalPensao;
	
	public CadastrarPensao() {
		this.pensoes = new ArrayList<>();
	}
	
	public void addPensao(Pensao pensao) {
		this.pensoes.add(pensao);
		this.totalPensao += pensao.getValor();
	}
	
	public double getTotalPensao() {
		return this.totalPensao;
	}

}
