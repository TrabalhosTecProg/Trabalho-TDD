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

}
