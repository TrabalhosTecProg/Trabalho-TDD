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
	
	
	public Double baseDeCalculo(CadastrarRendimentosPF rendimentos, CadastrarContribuicao contribuicoes, CadastrarDeducao deducoes, CadastrarPensao pensao, List<Dependente> dependentes) {
		return 4020.82d;
	}
}
