package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;

public class PensaoValorInvalidoTest {
	
	private Pensao pensao;
	
	@Before
	public void setup() {
		this.pensao= new Pensao();
	}

	@Test(expected = ValorPensaoInvalidoException.class)
	public void valorMinimo() throws ValorPensaoInvalidoException{
		pensao.setValor(0.00D);
	}

	@Test(expected = ValorPensaoInvalidoException.class)
	public void valorNegativo() throws ValorPensaoInvalidoException{
		pensao.setValor(-5.00D);
	}
	
	@Test(expected = ValorPensaoInvalidoException.class)
	public void valorMaximo() throws ValorPensaoInvalidoException{
		pensao.setValor(Double.MAX_VALUE);
	}
}
