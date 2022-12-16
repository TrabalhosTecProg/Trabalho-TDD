package org.tppe.tp1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RendimentoDescricaoTest {
    private Rendimento rendimento;
    String tDescricao;
    String expDesc;

    public RendimentoDescricaoTest(String tDescricao, String expDesc) {
        this.tDescricao = tDescricao;
        this.expDesc = expDesc;
    }

    @Before
    public void init() {
        this.rendimento = new Rendimento(); 
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametros() {
        Collection<Object[]> params = new ArrayList<>();

        params.add(new Object[] { "Aluguel","Aluguel" });
        params.add(new Object[] { "Desc", "Desc" });
        params.add(new Object[] { "Previdência", "Previdência" });

        return params;
    }

    @Test
    public void verificarDescricaoCadastrada() throws DescricaoEmBrancoException{
        rendimento.setDescricao(this.tDescricao);

        assertEquals(rendimento.getDescricao(), this.expDesc);
    }

}
