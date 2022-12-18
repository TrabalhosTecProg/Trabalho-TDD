package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;



public class ContribuicaoPrevidenciaria {

	private String descricao;	
	private double valor ;
	
	  private Boolean isLimiteValido(Double valor) {
	       return (valor > 0.0D && valor < Double.MAX_VALUE);
	    }
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) throws DescricaoEmBrancoException {
		if (descricao==null || descricao.isBlank() || descricao.isEmpty() )
            throw new DescricaoEmBrancoException(
                "Descrição não pode estar em branco!"); 
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
	public void setValor(double valor) throws ValorContribuicaoInvalidoException {
		 if (isLimiteValido(valor)) {
	           this.valor = valor;
	       }
	       else {
	           throw new ValorContribuicaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	       }
	}
	
	
	
	
	
}
