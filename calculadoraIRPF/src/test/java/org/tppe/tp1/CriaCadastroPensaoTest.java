package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.usecases.CadastrarPensao;

@RunWith(Parameterized.class)
public class CriaCadastroPensaoTest {
	CadastrarPensao pensao;
	Object[][] pensoes;
	double valoresCorretos;

	@Before
	public void setup(){
		pensao= new CadastrarPensao();
	}

	public CriaCadastroPensaoTest(Object[][] pensoes, double valoresCorretos) {
		this.pensoes= pensoes;
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
     public void CadastroContribuicaoTest() {
    	pensao= new CadastrarPensao();
    	for(Object[] c:pensoes) {
    		//CadastrarPensao pensao= new CadastrarPensao();
    		Pensao p = new Pensao((double)c[1]);
    		pensao.addPensao(p);
    	}
    	assertEquals(valoresCorretos, pensao.getTotalPensao(),0);
    }
	
	@Test
	public void cadastrarPensao() {
		for(Object[] p:pensoes) {
			Pensao temp_p = new Pensao();
			temp_p.setValor((double)p[1]);
			pensao.addPensao(temp_p);
    	}
    	assertEquals(valoresCorretos, pensao.getTotalPensao(), 0);
	}
	
	/*
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
	}*/

}