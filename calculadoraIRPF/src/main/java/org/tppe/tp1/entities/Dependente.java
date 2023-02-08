package org.tppe.tp1.entities;
import java.time.LocalDate;

import org.tppe.tp1.exceptions.NomeEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;


public class Dependente extends DeducaoDefault{
	
	private String nome;	
	private LocalDate data ;
	public static final double DEDUCAO_DEPENDENTE = 189.59d;
	
	public Dependente() {}
	public Dependente(String nome, LocalDate data) {
		super("Dependente", DEDUCAO_DEPENDENTE);
		this.nome= nome;
		this.data= data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeEmBrancoException {
		 if (nome==null||nome.isEmpty() || nome.isBlank()) 
	            throw new NomeEmBrancoException(
	                "Nome de dependente não pode estar em branco!"); 
		 this.nome= nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	public void checkValor(double valor) throws ValorDeducaoInvalidoException {
		if (valor != DEDUCAO_DEPENDENTE) {
			throw new ValorDeducaoInvalidoException(
					"Valores negativos ou maiores do que INF são inválidos");
		}
	}
	public TipoDeducao getType() {return TipoDeducao.DEPENDENTE;}
	
}
