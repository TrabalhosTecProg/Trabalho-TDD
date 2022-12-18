package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;
import org.tppe.tp1.usecases.CadastrarContribuicao;

@RunWith(Parameterized.class)
public class CriaCadastraContribuicaoTest {

	CadastrarContribuicao contribuicaoPrevidencia;
	Object[][] contribuicoes;
	double valoresCorretos;
	
	@Before
	public void setup(){
		contribuicaoPrevidencia= new CadastrarContribuicao();
	}

	public CriaCadastraContribuicaoTest(Object[][] contribuicoes, double valoresCorretos) {
		this.contribuicoes= contribuicoes;
		this.valoresCorretos= valoresCorretos;
	}
	
	@Parameters
    public static Collection<Object[]> getParametros() {
        Object[][] valorEsperado= new Object[][] {
        	{new Object[][] {
        		{"INSS", 30.00}
        		}, 30.00},
        	{new Object[][] {
        		{"INSS", 30.00},
        		{"Previdencia Privada", 300.00}
        		}, 330.00},
        	{new Object[][] {
        		{"INSS", 30.00},
        		{"Previdencia Privada", 300.00},
            	{"Contracheque", 50.00}
            		}, 380.00}
        };
        	return Arrays.asList(valorEsperado);
       
    }

    @Test
     public void CadastroContribuicaoTest() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
    	contribuicaoPrevidencia= new CadastrarContribuicao();
    	for(Object[] c:contribuicoes) {
    		//CadastrarContribuicao contribuicaoPrevidencia= new CadastrarContribuicao();
    		contribuicaoPrevidencia.add((String)c[0], (double)c[1]);
    	}
    	assertEquals(valoresCorretos, contribuicaoPrevidencia.getTotalContribuicao(),0);
    }
	
	/*@Test
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
	}*/
	
	
}
