package org.tppe.tp1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

public class RendimentoTest {
    private Rendimento rendimento;

    @Before
    public void init() {
        this.rendimento = new Rendimento(); 
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void descricaoEmBrancoTest() throws DescricaoEmBrancoException{
        rendimento.setDescricao("");
        rendimento.setValor(123.00F);
    }

    @Test
    public void verificaDescricaoCadastrada() throws DescricaoEmBrancoException{
        final String descricaoCadastrada = "Aluguel";
        rendimento.setDescricao(descricaoCadastrada);

        assertEquals(rendimento.getDescricao(), descricaoCadastrada);
    }
}
