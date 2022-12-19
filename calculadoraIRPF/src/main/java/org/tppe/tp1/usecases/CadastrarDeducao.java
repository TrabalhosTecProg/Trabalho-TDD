package org.tppe.tp1.usecases;

import java.util.ArrayList;
import java.util.List;

import org.tppe.tp1.entities.Deducao;

public class CadastrarDeducao {
	List<Deducao> deducoes;
	public double totalDeducao;

	public CadastrarDeducao() {
		this.deducoes = new ArrayList<>();
	}

	public void addDeducao(Deducao deducao) {
		this.deducoes.add(deducao);
		this.totalDeducao += deducao.getValor();
	}

	public double getTotalDeducao() {
		return this.totalDeducao;
	}

}
