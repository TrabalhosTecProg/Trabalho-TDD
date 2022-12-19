package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.usecases.CadastrarPensao;

class CriaCadastroPensaoTest {

	@Test
	void cadastrarUmaPensao() {
		CadastrarPensao cadastroPensao = new CadastrarPensao();
		Pensao pensao = new Pensao();
		pensao.setValor(1000.00D);
		cadastroPensao.addPensao(pensao);
		assertEquals(1000.00D, cadastroPensao.getTotalPensao());
	}
	
	@Test
	void cadastrarDuasPensões() {
		CadastrarPensao cadastroPensao = new CadastrarPensao();
		Pensao pensao = new Pensao();
		pensao.setValor(1000.00D);
		cadastroPensao.addPensao(pensao);
		
		Pensao pensao_2 = new Pensao();
		pensao_2.setValor(2000.00D);
		cadastroPensao.addPensao(pensao_2);
		
		assertEquals(3000.00D, cadastroPensao.getTotalPensao());
	}
	
	@Test
	void cadastrarTresPensões() {
		CadastrarPensao cadastroPensao = new CadastrarPensao();
		Pensao pensao = new Pensao();
		pensao.setValor(1000.00D);
		cadastroPensao.addPensao(pensao);
		
		Pensao pensao_2 = new Pensao();
		pensao_2.setValor(2000.00D);
		cadastroPensao.addPensao(pensao_2);
		
		Pensao pensao_3 = new Pensao();
		pensao_3.setValor(2000.00D);
		cadastroPensao.addPensao(pensao_3);
		
		
		assertEquals(5000.00D, cadastroPensao.getTotalPensao());
	}

}
