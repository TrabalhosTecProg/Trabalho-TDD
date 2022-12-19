package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.exceptions.NomeEmBrancoException;
import org.tppe.tp1.usecases.CadastroDependente;

public class DependenteNomeInvalidoTest {
	private Dependente dependente;
	
	private CadastroDependente cadastroDependentes;
	
	@Before
	public void setup() {
		this.dependente= new Dependente();
		this.cadastroDependentes= new CadastroDependente();
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

	// testar no cadastro
	@Test(expected = NomeEmBrancoException.class)
	public void NomeEmBrancoCadastro() throws NomeEmBrancoException{
		cadastroDependentes.add(" ", LocalDate.of(2020, 07, 22));
      
    }
	
	
}
