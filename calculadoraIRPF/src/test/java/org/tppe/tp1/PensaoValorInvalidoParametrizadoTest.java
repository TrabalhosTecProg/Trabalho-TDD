package org.tppe.tp1;


import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;

@RunWith(Parameterized.class)
public class PensaoValorInvalidoParametrizadoTest {

	   double valorPensaoInvalido;
	   private Pensao pensao;

	   public PensaoValorInvalidoParametrizadoTest(double tValor) {
	       this.valorPensaoInvalido = tValor;
	   }

	    @Before
	    public void setup() {
	        this.pensao = new Pensao();
	    }

	    @Parameterized.Parameters
	    public static Collection<Object> getParams() {
	       Collection <Object> params = new ArrayList<>();
	       params.add(0.0D);
	       params.add(-1.0D);
	       params.add(-0.0D);
	       params.add(Double.MAX_VALUE);

	       return params;
	    }

	    @Test(expected = ValorPensaoInvalidoException.class)
	    public void verificarValorInvalido() throws ValorPensaoInvalidoException {
	    	pensao.checkValor(this.valorPensaoInvalido);
	    }

}
