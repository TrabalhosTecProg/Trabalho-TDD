package org.tppe.tp1.usecases;

import java.util.List;

import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.utils.Limite;

public class AddContribuicao {

    private String descricao;
    private double valor;
    private List<ContribuicaoPrevidenciaria> contribuicoes;
    private double totalContribuicao;
    private Limite limite = new Limite();

    public AddContribuicao(String descricao, double valor, List<ContribuicaoPrevidenciaria> contribuicoes, double totalContribuicao) {
        this.descricao = descricao;
        this.valor = valor;
        this.contribuicoes = contribuicoes;
        this.totalContribuicao = totalContribuicao;
    }

    public void executar() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
        ContribuicaoPrevidenciaria c = new ContribuicaoPrevidenciaria(descricao, valor);
        if (descricao.isBlank() || descricao.isEmpty())
            throw new DescricaoEmBrancoException(
                    "Descrição não pode estar em branco!");
        if (!limite.isLimiteValido(valor))
            throw new ValorContribuicaoInvalidoException(
                    "Valor deve ser válido !");

        this.contribuicoes.add(c);
        totalContribuicao = totalContribuicao + valor;
    }

    public List<ContribuicaoPrevidenciaria> getContribuicoes() {
        return contribuicoes;
    }

    public double getTotalContribuicao() {
        return totalContribuicao;
    }
}
