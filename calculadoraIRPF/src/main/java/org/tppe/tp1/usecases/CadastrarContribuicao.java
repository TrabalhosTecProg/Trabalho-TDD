package org.tppe.tp1.usecases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;

import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;


public class CadastrarContribuicao {
	
	
	List<ContribuicaoPrevidenciaria> contribuicoes;
	public double totalContribuicao;
	
	public CadastrarContribuicao() {
		contribuicoes= new LinkedList<ContribuicaoPrevidenciaria>();
	}
	
	  private Boolean isLimiteValido(Double valor) {
	       return (valor > 0.0D && valor < Double.MAX_VALUE);
	    }
	
	
  public void add( String descricao, double valor) throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException{
		ContribuicaoPrevidenciaria c= new ContribuicaoPrevidenciaria(descricao, valor);
		 if (descricao.isBlank() || descricao.isEmpty() )
	            throw new DescricaoEmBrancoException(
	                "Descrição não pode estar em branco!"); 
		 if ( !isLimiteValido(valor))
	            throw new ValorContribuicaoInvalidoException(
	                "Valor deve ser válido !"); 
		 
		this.contribuicoes.add(c);
		totalContribuicao= totalContribuicao+ valor;
  
  }

  
	public double getTotalContribuicao() {
		return this.totalContribuicao;
	}

	
	
}
