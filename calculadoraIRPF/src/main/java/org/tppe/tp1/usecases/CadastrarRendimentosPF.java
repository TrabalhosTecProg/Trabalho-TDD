package org.tppe.tp1.usecases;

import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;
import org.tppe.tp1.usecases.interfaces.CadastrarRendimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CadastrarRendimentosPF implements CadastrarRendimento {
    List<Rendimento> rendimentos;
//    List<ListenCadastro> listeners;
    public CadastrarRendimentosPF() {
        this.rendimentos = new ArrayList<>();
//        this.listeners = new ArrayList<>();
    }
    public void add(Rendimento r) {
        this.rendimentos.add(r);
    }

    public void add (String descricao, Double rendimento) throws CadastroInvalidoException{
        Optional<Rendimento> created = createRendimento(descricao, rendimento);
        if(created.isPresent()) {
            add(created.get());
        } else {
            throw new CadastroInvalidoException("Utilize parâmetros válidos para cadastro");
        }
    }

     public static Optional<Rendimento> createRendimento(String descricao, double value) {
        Rendimento r = new Rendimento();
        try {
            r.setDescricao(descricao);
            r.setValor(value);
            return Optional.of(r);
        } catch (DescricaoEmBrancoException | ValorRendimentoInvalidoException ex) {
            System.out.println("Cadastro de rendimentos inválido: " +
                    ex.getMessage());

            ex.printStackTrace();
        }

        return Optional.empty();
     }

     public List<Rendimento> getRendimentos() {
        return this.rendimentos;
     }

     public int getSize() {
        return this.rendimentos.size();
     }


//     public void addObserver (ListenCadastro l) {
//        this.listeners.add(l);
//    }
//
//    public void hasChanged() {
//        this.listeners.stream().forEach((listener) -> {
//            listener.update(this);
//        });
//    }
}
