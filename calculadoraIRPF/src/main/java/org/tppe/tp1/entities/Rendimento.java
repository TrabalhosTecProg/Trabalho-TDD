package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;

public class Rendimento {
   private String descricao;
   private double valor;
   
   public Rendimento() {};
   public Rendimento(String descricao, double valor){
       try {
           setDescricao(descricao);
           setValor(valor);
       } catch(DescricaoEmBrancoException | ValorRendimentoInvalidoException ex) {
           System.out.println("Valores de rendimento e desrcição inválidos");
       }
   }

    private Boolean isLimiteValido(Double valor) {
       return (valor > 0.0D && valor < Double.MAX_VALUE);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) throws DescricaoEmBrancoException {
        if (descricao.isBlank() || descricao.isEmpty() )
            throw new DescricaoEmBrancoException(
                "Descrição não pode estar em branco!"); 
       else this.descricao = descricao;
   }

    public void setValor(double valor) throws ValorRendimentoInvalidoException {
       if (isLimiteValido(valor)) {
           this.valor = valor;
       }
       else {
           throw new ValorRendimentoInvalidoException(
                   "Valores negativos ou maiores do que INF são inválidos");
       }
    }
}
