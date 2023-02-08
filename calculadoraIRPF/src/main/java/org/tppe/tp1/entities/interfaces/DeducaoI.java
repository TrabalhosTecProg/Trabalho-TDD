package org.tppe.tp1.entities.interfaces;

import org.tppe.tp1.entities.TipoDeducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

public interface DeducaoI {
    public TipoDeducao getType();
    public String getDescricao();
    public double getValor();
    public void setDescricao(String descricao) throws DescricaoEmBrancoException;
    public void setValor(double valor);
    public void checkValor(double valor) throws ValorDeducaoInvalidoException;
}
