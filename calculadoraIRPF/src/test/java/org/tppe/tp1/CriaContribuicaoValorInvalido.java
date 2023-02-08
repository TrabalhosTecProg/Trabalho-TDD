package org.tppe.tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.usecases.CadastrarContribuicao;


public class CriaContribuicaoValorInvalido {

	    @Test(expected=ValorContribuicaoInvalidoException.class)
	    public void verificaValoresINvalidos() throws ValorContribuicaoInvalidoException, CadastroInvalidoException, DescricaoEmBrancoException {
	    	CadastrarContribuicao contribuicao = new CadastrarContribuicao();
	    	contribuicao.add("INSS", -300.58D);
	    }
	    
	    
	    @Test(expected=ValorContribuicaoInvalidoException.class)
	    public void verificaValoresINvalidosSet() throws  ValorContribuicaoInvalidoException {
	    	ContribuicaoPrevidenciaria contribuicao = new ContribuicaoPrevidenciaria();
	    	contribuicao.checkValor( -300.58D);
	    }

}
