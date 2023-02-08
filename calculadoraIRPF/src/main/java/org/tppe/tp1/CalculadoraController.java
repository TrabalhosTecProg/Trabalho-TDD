package org.tppe.tp1;

import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.exceptions.*;
import org.tppe.tp1.usecases.*;
import org.tppe.tp1.usecases.interfaces.CadastrarRendimento;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraController {

    IRPF irpf;
    CadastrarPensao pensoes;
    CadastrarDeducao deducoes;
    CadastrarRendimento rendimentos;
    List<Dependente> dependentes;
    CadastrarContribuicao contribs;

    public CalculadoraController() {
        pensoes = new CadastrarPensao();
        deducoes = new CadastrarDeducao();
        rendimentos = new CadastrarRendimentosPF();
        dependentes = new ArrayList<>();
        contribs = new CadastrarContribuicao();
        irpf = new IRPF();
    }

    public void addRendimento(String descricao, double valor) throws CadastroInvalidoException{
        try {
            rendimentos.add(descricao,valor);
        } catch(CadastroInvalidoException ex){
            throw ex;
        }
    }

    public void addDependentes(String nome) throws NomeEmBrancoException {
       Dependente d = new Dependente();
       try {
           d.setNome(nome);
           this.dependentes.add(d);
       } catch(NomeEmBrancoException ex) {
           throw ex;
       }
    }

    public void addPensao(double value) throws ValorPensaoInvalidoException {
        Pensao p = new Pensao();
        try {
            p.checkValor(value);
            this.pensoes.addPensao(p);
        } catch(ValorPensaoInvalidoException ex) {
            throw ex;
        }
    }

    public void addPrevidencia(String descricao, double value)
            throws ValorContribuicaoInvalidoException, DescricaoEmBrancoException {
        try {
            contribs.add(descricao, value);
        } catch(ValorContribuicaoInvalidoException | DescricaoEmBrancoException ex) {
            throw ex;
        }
    }

    public void addDeducao(String descricao, double value)
            throws ValorDeducaoInvalidoException, DescricaoEmBrancoException {
        Deducao d = new Deducao();
        try {
            d.setDescricao(descricao);
            d.checkValor(value);
            this.deducoes.addDeducao(d);
        } catch(ValorDeducaoInvalidoException | DescricaoEmBrancoException ex) {
            throw ex;
        }
    }

    private void setBases() {
        this.irpf.baseDeCalculo(rendimentos, contribs, deducoes, pensoes, dependentes);
    }
    public IRPF getResults() {
        setBases();

        irpf.calcularBaseFaixas( this.irpf.getTotalBaseDeCalculo());
        irpf.calcularImpostoPorFaixa();
        return this.irpf;
    }
}
