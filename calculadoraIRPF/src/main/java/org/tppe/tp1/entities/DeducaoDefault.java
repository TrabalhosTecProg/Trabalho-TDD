package org.tppe.tp1.entities;

import org.tppe.tp1.entities.interfaces.DeducaoI;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;
import org.tppe.tp1.utils.Limite;

public abstract class DeducaoDefault implements DeducaoI{
    private String descricao;
    private double valor ;
    Limite limite = new Limite();

    public DeducaoDefault() {}
    public DeducaoDefault(String descricao, double valor) {
        this.descricao= descricao;
        this.valor= valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) throws DescricaoEmBrancoException{
        if (descricao==null || descricao.isBlank())
            throw new DescricaoEmBrancoException(
                    "Descricao de deducao não pode estar em branco!");
        this.descricao= descricao;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
