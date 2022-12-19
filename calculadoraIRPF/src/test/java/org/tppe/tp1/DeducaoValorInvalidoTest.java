package org.tppe.tp1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;


public class DeducaoValorInvalidoTest {
	private Deducao deducao;
	
	@Before
	public void setup() {
		this.deducao= new Deducao();
	}

	@Test(expected = ValorDeducaoInvalidoException.class)
	public void valorMinimo() throws ValorDeducaoInvalidoException{
	     deducao.setValor(0.00D);
	}

	@Test(expected = ValorDeducaoInvalidoException.class)
	public void valorNegativo() throws ValorDeducaoInvalidoException{
		deducao.setValor(-5.00D); 
    }
	
	@Test(expected = ValorDeducaoInvalidoException.class)
	public void valorMaximo() throws ValorDeducaoInvalidoException{
		deducao.setValor(Double.MAX_VALUE); 
    }

}
