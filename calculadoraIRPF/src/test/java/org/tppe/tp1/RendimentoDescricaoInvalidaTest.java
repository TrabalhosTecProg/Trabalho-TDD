package org.tppe.tp1;

import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

public class RendimentoDescricaoInvalidaTest {
    private Rendimento rendimento;

    @Before
    public void init() {
        this.rendimento = new Rendimento();
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void verificarDescricaoEmBranco() throws DescricaoEmBrancoException{
        rendimento.setDescricao("");
    }
}
