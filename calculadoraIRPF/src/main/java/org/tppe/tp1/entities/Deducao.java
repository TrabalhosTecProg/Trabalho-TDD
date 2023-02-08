package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

public class Deducao extends DeducaoDefault {
	private String descricao;	
	private double valor ;

	public Deducao() {}
	public Deducao(String descricao, double valor) {
		super(descricao, valor);
	}
	public TipoDeducao getType() {return TipoDeducao.OUTRO;}

	public void checkValor(double valor)  throws ValorDeducaoInvalidoException{
		if (!(isLimiteValido(valor))) {
	        throw new ValorDeducaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	    }
		super.setValor(valor);
	}
}
