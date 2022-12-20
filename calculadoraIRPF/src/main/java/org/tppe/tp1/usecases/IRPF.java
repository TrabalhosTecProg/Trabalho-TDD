package org.tppe.tp1.usecases;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.entities.Dependente;

public class IRPF {
	private Map<String, Double> faixaBase = new LinkedHashMap<String, Double>();
	private Map<String, Double> impostoFaixa = new LinkedHashMap<String, Double>();
	private Double totalBaseDeCalculo;
	private Double totalImpostos;
	
	
	public void baseDeCalculo(CadastrarRendimentosPF rendimentos, CadastrarContribuicao contribuicoes, CadastrarDeducao deducoes, CadastrarPensao pensao, List<Dependente> dependentes) {
		Double somaRendimentos=0d;
		for(Rendimento rendimento : rendimentos.getRendimentos()){
		     somaRendimentos += rendimento.getValor();
		}
		
		Double somaContribuicoes=contribuicoes.getTotalContribuicao();
		Double somaOutrasDeducoes=deducoes.getTotalDeducao();
		Double somaPensoes=pensao.getTotalPensao();
		Double somaDependentes=dependentes.size()*189.59d;
		
		Double somaDeducoes = somaContribuicoes + somaOutrasDeducoes + somaPensoes + somaDependentes;
		this.totalBaseDeCalculo = somaRendimentos - somaDeducoes;
	}
	
	public Double getTotalBaseDeCalculo() {
		return this.totalBaseDeCalculo;
	}

}
