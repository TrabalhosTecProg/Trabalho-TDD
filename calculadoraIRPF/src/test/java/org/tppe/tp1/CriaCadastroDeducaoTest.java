package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;
import org.tppe.tp1.usecases.CadastrarDeducao;


@RunWith(Parameterized.class)
public class CriaCadastroDeducaoTest {
	CadastrarDeducao deducao;
	Object[][] deducoes;
	double valoresCorretos;
	
	@Before
	public void setup(){
		deducao= new CadastrarDeducao();
	}

	public CriaCadastroDeducaoTest(Object[][] deducoes, double valoresCorretos) {
		this.deducoes= deducoes;
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
     public void CadastroDeducaoTest() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException {
    	
    	for(Object[] c:deducoes) {
    		Deducao d = new Deducao();
    		d.setDescricao((String)c[0]);
    		d.setValor((double)c[1]);
    		
    		deducao.addDeducao(d);
    	}
    	assertEquals(valoresCorretos, deducao.getTotalDeducao(),0);
    }

	/*@Test
	void cadastrarUmaDeducao() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException{
		 cadastroDeducao = new ();
		Deducao deducao = new Deducao();
		deducao.setDescricao("previdencia privada");
		deducao.setValor(1000.00D);
		cadastroDeducao.addDeducao(deducao);
		assertEquals(1000.00D, cadastroDeducao.getTotalDeducao());
	}
	
	@Test
	void cadastrarDoisDeducao() throws DescricaoEmBrancoException, ValorDeducaoInvalidoException{
		 cadastroDeducao = new ();
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
		 cadastroDeducao = new ();
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
	}*/
}
