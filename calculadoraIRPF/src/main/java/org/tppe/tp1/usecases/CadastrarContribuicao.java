package org.tppe.tp1.usecases;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.tppe.tp1.entities.ContribuicaoPrevidenciaria;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.CadastroInvalidoException;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorRendimentoInvalidoException;

public class CadastrarContribuicao {
	
	
	List<ContribuicaoPrevidenciaria> contribuicoes;
	public ContribuicaoPrevidenciaria c= new ContribuicaoPrevidenciaria();
	
  public CadastrarContribuicao() {
      this.contribuicoes = new ArrayList<>();

  }
  public void add(ContribuicaoPrevidenciaria contribuicao) {
      this.contribuicoes.add(contribuicao);
  }

  

	public void add (String descricao, Double valor) throws CadastroInvalidoException{
        Optional<ContribuicaoPrevidenciaria> created = createContribuicao(descricao, valor);
        if(created.isPresent()) {
            add(created.get());
        } else {
            throw new CadastroInvalidoException("Utilize parâmetros válidos para cadastro de contribuicao");
        }
    }
	
	
	
	private Optional<ContribuicaoPrevidenciaria> createContribuicao(String descricao, Double valor) {
		 this.c.setDescricao(descricao);
         this.c.setValor(valor);
         return Optional.of(c);
	}
	public double getTotalContribuicao() {
		return this.c.getValor();
	}

	
	
}
