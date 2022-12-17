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
	@Test(expected = NomeEmBrancoException.class)
	public void NomeVazioTest() throws NomeEmBrancoException{
        dependente.setNome(null); // esse falhou e na classe foi adicionada a cláusula de vazio
        dependente.setData(LocalDate.of(2020, 07, 22));
    }

}
