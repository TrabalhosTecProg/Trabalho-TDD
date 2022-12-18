package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.usecases.CadastrarContribuicao;

class CriaCadastraContribuicaoTest {

	CadastrarContribuicao contribuicaoPrevidencia;
	
	
	@Test
	void testCadastroUmaContribuicao() throws CadastroInvalidoException {
		contribuicaoPrevidencia= new CadastrarContribuicao();
		contribuicaoPrevidencia.add("INSS", 30.00);
		assertEquals(30.00, contribuicaoPrevidencia.getTotalContribuicao(), 0);
	}
	@Test
	void testCadastroDuasContribuicoes() throws CadastroInvalidoException {
		
		contribuicaoPrevidencia= new CadastrarContribuicao();
		contribuicaoPrevidencia.add("INSS", 30.00);
		contribuicaoPrevidencia.add("Previdencia Privada", 300.00);
		assertEquals(330.00, contribuicaoPrevidencia.getTotalContribuicao(), 0);
	}

	@Test
	void testCadastroTresContribuicoes() throws CadastroInvalidoException {
		
		contribuicaoPrevidencia= new CadastrarContribuicao();
		contribuicaoPrevidencia.add("INSS", 30.00);
		contribuicaoPrevidencia.add("Previdencia Privada", 300.00);
		contribuicaoPrevidencia.add("Contracheque", 50.00);
		assertEquals(380.00, contribuicaoPrevidencia.getTotalContribuicao(), 0);
	}
	
	
}
