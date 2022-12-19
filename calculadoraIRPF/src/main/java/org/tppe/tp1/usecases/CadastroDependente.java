package org.tppe.tp1.usecases;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.exceptions.NomeEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;

public class CadastroDependente {
	
	List<Dependente> dependentes;
	
	public CadastroDependente() {
		dependentes= new LinkedList<Dependente>();
	}

	private String nome;	
	private LocalDate data ;
	
  public void add( String nome, LocalDate data ) throws NomeEmBrancoException{
	  Dependente c= new Dependente(nome, data);
		 if (nome.isBlank() || nome.isEmpty() )
	            throw new NomeEmBrancoException(
	                "Nome não pode estar em branco!");
		this.dependentes.add(c);
 
  }

}
