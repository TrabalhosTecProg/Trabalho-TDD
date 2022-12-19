package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;
import org.tppe.tp1.usecases.CadastrarDeducao;

class CriaCadastroDeducaoTest {

	@Test
	void cadastrarUmaDeducao() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException{
		CadastrarDeducao cadastroDeducao = new CadastrarDeducao();
		Deducao deducao = new Deducao();
		deducao.setDescricao("previdencia privada");
		deducao.setValor(1000.00D);
		cadastroDeducao.addDeducao(deducao);
		assertEquals(1000.00D, cadastroDeducao.getTotalDeducao());
	}
	
	@Test
	void cadastrarDoisDeducao() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException{
		CadastrarDeducao cadastroDeducao = new CadastrarDeducao();
		Deducao deducao = new Deducao();
		deducao.setDescricao("previdencia privada");
		deducao.setValor(1000.00D);
		cadastroDeducao.addDeducao(deducao);
		
		
		Deducao deducao2 = new Deducao();
		deducao2.setDescricao("previdencia privada");
		deducao2.setValor(2000.00D);
		cadastroDeducao.addDeducao(deducao2);
		
		assertEquals(3000.00D, cadastroDeducao.getTotalDeducao());
	}
	
	@Test
	void cadastrarTresDeducao() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException{
		CadastrarDeducao cadastroDeducao = new CadastrarDeducao();
		Deducao deducao = new Deducao();
		deducao.setDescricao("previdencia privada");
		deducao.setValor(1000.00D);
		cadastroDeducao.addDeducao(deducao);
		
		
		Deducao deducao2 = new Deducao();
		deducao2.setDescricao("previdencia privada");
		deducao2.setValor(2000.00D);
		cadastroDeducao.addDeducao(deducao2);
		
		Deducao deducao3 = new Deducao();
		deducao3.setDescricao("previdencia privada");
		deducao3.setValor(1000.00D);
		cadastroDeducao.addDeducao(deducao3);
		assertEquals(4000.00D, cadastroDeducao.getTotalDeducao());
	}
}
