package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.utils.Limite;


public class ContribuicaoPrevidenciaria extends DeducaoDefault{

	public ContribuicaoPrevidenciaria() {
		super();
	}
	public ContribuicaoPrevidenciaria(String descricao, double valor) {
		super(descricao, valor);
	}

	public TipoDeducao getType() {
		return TipoDeducao.PREVIDENCIA;
	}

	public void checkValor(double valor) throws ValorContribuicaoInvalidoException {
		 if (limite.isLimiteValido(valor)) {
	           super.setValor(valor);

	       }
	       else {
	           throw new ValorContribuicaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	       }
	}
}
