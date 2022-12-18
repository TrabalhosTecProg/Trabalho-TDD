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
	

}
