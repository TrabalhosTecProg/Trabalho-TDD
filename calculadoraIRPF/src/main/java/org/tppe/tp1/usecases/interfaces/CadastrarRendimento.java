package org.tppe.tp1.usecases.interfaces;

import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;
import org.tppe.tp1.usecases.ListenCadastro;

import java.util.List;


public interface CadastrarRendimento {
    public void add(Rendimento r) ;
    public void add(String descricao, Double rendimento) throws CadastroInvalidoException;
    public int getSize();
    public List<Rendimento> getRendimentos();
//    public void addObserver(ListenCadastro l);
//    public void hasChanged();
}
