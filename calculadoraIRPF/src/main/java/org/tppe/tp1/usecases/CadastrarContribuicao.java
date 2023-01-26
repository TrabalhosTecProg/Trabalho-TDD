package org.tppe.tp1.usecases;

import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.utils.Limite;

import java.util.LinkedList;
import java.util.List;


public class CadastrarContribuicao {
	
	
	List<ContribuicaoPrevidenciaria> contribuicoes;
	public double totalContribuicao;
	private Limite limite = new Limite();
	
	public CadastrarContribuicao() {
		contribuicoes= new LinkedList<ContribuicaoPrevidenciaria>();
	}

	
  public void add( String descricao, double valor) throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException{
		ContribuicaoPrevidenciaria c= new ContribuicaoPrevidenciaria(descricao, valor);
		 if (descricao.isBlank() || descricao.isEmpty() )
	            throw new DescricaoEmBrancoException(
	                "Descrição não pode estar em branco!"); 
		 if ( !limite.isLimiteValido(valor))
	            throw new ValorContribuicaoInvalidoException(
	                "Valor deve ser válido !"); 
		 
		this.contribuicoes.add(c);
		totalContribuicao= totalContribuicao+ valor;
  
  }

  
	public double getTotalContribuicao() {
		return this.totalContribuicao;
	}

	
	
}
