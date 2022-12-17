package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.exceptions.NomeEmBrancoException;

public class DependenteNomeInvalidoTest {
	private Dependente dependente;
	@Before
	public void setup() {
		this.dependente= new Dependente();
	}
	
	@Test(expected = NomeEmBrancoException.class)
	public void NomeEmBrancoTest() throws NomeEmBrancoException{
	        dependente.setNome("");
	        dependente.setData(LocalDate.of(2018, 07, 22));
	    }


}
