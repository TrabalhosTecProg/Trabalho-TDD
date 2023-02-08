package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;
import org.tppe.tp1.utils.Limite;

public class Pensao extends DeducaoDefault {

	public Pensao() {
		super();
	}
	
	public Pensao(double valor) {
		super("Pensão", valor);
	}
	public void checkValor(double valor)  throws ValorPensaoInvalidoException{
		if (!limite.isLimiteValido(valor)) {
			throw new ValorPensaoInvalidoException(
					"Valores negativos ou maiores do que INF são inválidos");
		}
		super.setValor(valor);
	}
	
	public TipoDeducao getType() { return TipoDeducao.OUTRO; }
}
