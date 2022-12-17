package org.tppe.tp1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.exceptions.NomeEmBrancoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DependenteNomeParametrizadoTest {

	public String nome;	
	
	public DependenteNomeParametrizadoTest(String nome) {
	this.nome= nome;
	}
	
	@Parameters
    public static Collection<Object[]> getParametros() {
        Object[][] parametros= new Object[][]{
        	{null},
        	{"    "},
        	{""}
        };

        return Arrays.asList(parametros);
    }

   
    @Test(expected = NomeEmBrancoException.class)
	public void NomeEmBrancoTest() throws NomeEmBrancoException{
			Dependente dependente= new Dependente();
	        dependente.setNome(nome);
	    }
    
    
}
