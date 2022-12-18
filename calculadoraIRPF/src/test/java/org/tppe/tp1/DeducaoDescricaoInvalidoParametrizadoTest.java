package org.tppe.tp1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

@RunWith(Parameterized.class)
public class DeducaoDescricaoInvalidoParametrizadoTest {

public String descricao;	
	
	public DeducaoDescricaoInvalidoParametrizadoTest(String descricao) {
		
		this.descricao= descricao;
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

   
    @Test(expected = DescricaoEmBrancoException.class)
	public void descricaoEmBrancoTest() throws DescricaoEmBrancoException{
			Deducao Deducao= new Deducao();
	        Deducao.setDescricao(descricao);
	}
 

}
