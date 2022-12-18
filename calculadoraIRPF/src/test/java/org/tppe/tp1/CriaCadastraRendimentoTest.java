package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.usecases.CadastrarRendimentosPF;
import org.tppe.tp1.usecases.interfaces.CadastrarRendimento;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class CriaCadastraRendimentoTest {

    CadastrarRendimento cadastro;
    Map<String, Double> rendimentosAssert;
    List<String> descs;
    List<Double> values;

    public CriaCadastraRendimentoTest(List<String> descs, List<Double> values) {
        this.descs = descs;
        this.values = values;
    }
    @Before
    public void init() {
       this.cadastro = new CadastrarRendimentosPF();
       this.rendimentosAssert = new HashMap<>();

       ListIterator<String> it = this.descs.listIterator();
       while(it.hasNext()) {
           int i = it.nextIndex();
           String val = it.next();
           this.rendimentosAssert.put(val, values.get(i));
       }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParams() {
       return List.of(
               new Object[] {
                       List.of("Aluguel do seu Antônio", "Aluguel da Dona Maria"), List.of(1500.56, 1856.45)},
               new Object[] {
                       List.of("Contra-cheque", "Aluguel", "Investimento"), List.of(50689.45, 20000.00, 3000.59)}
       ) ;
    }

    @Test
    public void criaCadastraRendimento() throws CadastroInvalidoException {
        for (int i = 0; i < descs.size(); ++i) {
            cadastro.add(descs.get(i), values.get(i));
        }

        assertEquals(descs.size(), cadastro.getSize());
        for (Rendimento rendimento : this.cadastro.getRendimentos()) {
            assertTrue(this.rendimentosAssert.containsKey(rendimento.getDescricao()));
            assertEquals(
                    this.rendimentosAssert.get(rendimento.getDescricao()),
                    (Double) rendimento.getValor());
        }
    }

}
