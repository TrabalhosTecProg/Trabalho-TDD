package org.tppe.tp1;
import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.NomeEmBrancoException;

public class DeducaoDescricaoInvalidoTest {

	private Deducao deducao;
	
	@Before
	public void setup() {
		this.deducao= new Deducao();
	}

	@Test(expected = DescricaoEmBrancoException.class)
	public void DescricaoEmBrancoTest() throws DescricaoEmBrancoException{
	     deducao.setDescricao("");
	}

	@Test(expected = DescricaoEmBrancoException.class)
	public void DescricaoVazioTest() throws DescricaoEmBrancoException{
		deducao.setDescricao(null); // esse falhou e na classe foi adicionada a cláusula de vazio
    }
}
