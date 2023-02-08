package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;

public class Pensao extends DeducaoDefault {
	
	public Pensao() {
		super();
	}
	
	public Pensao(double valor) {
		super("Pensão", valor);
	}
	public void checkValor(double valor)  throws ValorPensaoInvalidoException{
		if (!(isLimiteValido(valor))) {
			throw new ValorPensaoInvalidoException(
					"Valores negativos ou maiores do que INF são inválidos");
		}
		super.setValor(valor);
	}
	
	public TipoDeducao getType() { return TipoDeducao.OUTRO; }
	
}
