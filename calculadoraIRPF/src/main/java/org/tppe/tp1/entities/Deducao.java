package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;
import org.tppe.tp1.utils.Limite;

public class Deducao extends DeducaoDefault {
	private Limite limite = new Limite();

	public Deducao() {}
	public Deducao(String descricao, double valor) {
		super(descricao, valor);
	}
	public TipoDeducao getType() {return TipoDeducao.OUTRO;}

	public void checkValor(double valor)  throws ValorDeducaoInvalidoException{
		if (!limite.isLimiteValido(valor)) {
	        throw new ValorDeducaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	    }
		super.setValor(valor);
	}
}
