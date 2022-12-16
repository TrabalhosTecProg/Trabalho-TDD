package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

public class Rendimento {
   private String descricao;
   private double valor;
   
   public Rendimento(){}



    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) throws DescricaoEmBrancoException {
        if (descricao.isEmpty()) 
            throw new DescricaoEmBrancoException(
                "Descrição não pode estar em branco!"); 
       this.descricao = descricao;
   }
    public void setValor(double valor) {
        this.valor=valor;
    }
}
