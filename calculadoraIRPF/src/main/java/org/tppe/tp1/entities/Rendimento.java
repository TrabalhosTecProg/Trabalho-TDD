package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;

public class Rendimento {
   private String descricao;
   private double valor;
   
   public Rendimento(){}

   public double setValor(double valor) {
        return 0.0;
   }

   public void setDescricao(String descricao) throws DescricaoEmBrancoException {
        if (descricao.isEmpty()) 
            throw new DescricaoEmBrancoException(
                "Descrição não pode estar em branco!"); 
        
   }
}
