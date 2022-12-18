package org.tppe.tp1.usecases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;

public class CadastrarContribuicao {
	
	
	List<ContribuicaoPrevidenciaria> contribuicoes;
	public double totalContribuicao;
	
	public CadastrarContribuicao() {
		contribuicoes= new LinkedList<ContribuicaoPrevidenciaria>();
	}
	
  public void add( String descricao, double valor) {
		ContribuicaoPrevidenciaria c= new ContribuicaoPrevidenciaria(descricao, valor);
		this.contribuicoes.add(c);
		totalContribuicao= totalContribuicao+ valor;
  
  }

  
	public double getTotalContribuicao() {
		return this.totalContribuicao;
	}

	
	
}
