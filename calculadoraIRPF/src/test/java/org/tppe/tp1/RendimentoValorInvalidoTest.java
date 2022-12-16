package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RendimentoValorInvalidoTest {

    Double valorRendimentoInvalido;
    private Rendimento rendimento;

   public RendimentoValorInvalidoTest(Double tValor) {
       this.valorRendimentoInvalido = tValor;
   }

    @Before
    public void init() {
        this.rendimento = new Rendimento();
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

    @Test(expected = ValorRendimentoInvalidoException.class)
    public void verificarValorInvalido() throws ValorRendimentoInvalidoException {
        rendimento.setValor(this.valorRendimentoInvalido);
    }
}
