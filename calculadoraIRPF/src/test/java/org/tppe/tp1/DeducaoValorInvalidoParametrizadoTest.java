package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

@RunWith(Parameterized.class)
public class DeducaoValorInvalidoParametrizadoTest {

	   double valorDeducaoInvalido;
	   private Deducao deducao;

	   public DeducaoValorInvalidoParametrizadoTest(double tValor) {
	       this.valorDeducaoInvalido = tValor;
	   }

	    @Before
	    public void setup() {
	        this.deducao = new Deducao();
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

	    @Test(expected = ValorDeducaoInvalidoException.class)
	    public void verificarValorInvalido() throws ValorDeducaoInvalidoException {
	    	deducao.setValor(this.valorDeducaoInvalido);
	    }

}
