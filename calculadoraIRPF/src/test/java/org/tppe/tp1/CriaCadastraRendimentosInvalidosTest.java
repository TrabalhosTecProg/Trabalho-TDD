package org.tppe.tp1;

import org.junit.Test;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.usecases.CadastrarRendimentosPF;
import org.tppe.tp1.usecases.interfaces.CadastrarRendimento;

import static org.junit.Assert.assertEquals;

public class CriaCadastraRendimentosInvalidosTest {
    @Test(expected=CadastroInvalidoException.class)
    public void verificaDescripsNulas() throws CadastroInvalidoException {
        CadastrarRendimento cadastro = new CadastrarRendimentosPF();
        cadastro.add("", 1234.12);
        assertEquals(cadastro.getSize(), 0);
    }
    @Test(expected=CadastroInvalidoException.class)
    public void verificaValoresINvalidos() throws CadastroInvalidoException {
        CadastrarRendimento cadastro = new CadastrarRendimentosPF();
        cadastro.add("Aluguel", -300.58D);
        assertEquals(0, cadastro.getSize());
    }
}
