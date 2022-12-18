package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

public class ContribuicaoDescricaoInvalidaTest {

	 private ContribuicaoPrevidenciaria contribuicao;

	    @Before
	    public void init() {
	        this.contribuicao = new ContribuicaoPrevidenciaria();
	    }

	    @Test(expected = DescricaoEmBrancoException.class)
	    public void verificarDescricaoEmBranco() throws DescricaoEmBrancoException{
	    	contribuicao.setDescricao("");
	    }
	    
	    @Test(expected = DescricaoEmBrancoException.class)
	    public void verificarDescricaoNula() throws DescricaoEmBrancoException{
	    	contribuicao.setDescricao(null);
	    }
	
}
