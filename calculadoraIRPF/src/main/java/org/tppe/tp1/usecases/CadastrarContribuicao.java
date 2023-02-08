package org.tppe.tp1.usecases;

import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;


import java.util.LinkedList;
import java.util.List;


public class CadastrarContribuicao {


	List<ContribuicaoPrevidenciaria> contribuicoes;
	public double totalContribuicao = 0;

	public CadastrarContribuicao() {
		contribuicoes = new LinkedList<ContribuicaoPrevidenciaria>();
	}

	public void add(String descricao, double valor)
			throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		AddContribuicao addMethod = new AddContribuicao(descricao, valor, contribuicoes, totalContribuicao);
		addMethod.executar();
		this.totalContribuicao = addMethod.getTotalContribuicao();
		this.contribuicoes = addMethod.getContribuicoes();
	}

	public double getTotalContribuicao() {
		return this.totalContribuicao;
	}
}