package org.tppe.tp1.usecases;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.entities.FaixasDeBase;

public class IRPF {
	private Map<String, Double> faixaBase = new LinkedHashMap<String, Double>();
	private Map<String, Double> impostoFaixa = new LinkedHashMap<String, Double>();
	private Double totalBaseDeCalculo;
	private Double totalImpostos=0d;
	private Double aliquotaEfetiva;
	private Double somaRendimentos=0d;
	
	
	public void baseDeCalculo(CadastrarRendimentosPF rendimentos, CadastrarContribuicao contribuicoes, CadastrarDeducao deducoes, CadastrarPensao pensao, List<Dependente> dependentes) {
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
	
	public void calcularBaseFaixas(Double baseDeCalculo) {
		FaixasDeBase base = new FaixasDeBase();
		
		for(Map.Entry<String, Double> faixa : base.getLimitesFaixaBase().entrySet()) {
			if(baseDeCalculo > faixa.getValue()) {
				faixaBase.put(faixa.getKey(), faixa.getValue());
				baseDeCalculo -= faixa.getValue();
			} else {
				faixaBase.put(faixa.getKey(), baseDeCalculo);
				baseDeCalculo=0d;
			}
		}
		     
	}
	
	public Map<String, Double> getBaseFaixas() {
		return this.faixaBase;
	}
	
	public void calcularImpostoPorFaixa(){
		FaixasDeBase base = new FaixasDeBase();
		
		for(int i=1; i<=5; i++) {
			Double imposto = base.getAliquotaFaixaBase().get("FAIXA_"+String.valueOf(i))/100 * faixaBase.get("FAIXA_"+String.valueOf(i));
			impostoFaixa.put("FAIXA_"+String.valueOf(i), imposto);
		}
	}
	
	public Map<String, Double> getImpostoPorFaixa() {
		return this.impostoFaixa;
	}
	
	public Double getTotalImposto() {
		for(Map.Entry<String, Double> valor : impostoFaixa.entrySet()) {
			totalImpostos += valor.getValue();
		}
		return totalImpostos;
	}
	
	public Double getAliquotaEfetiva() {
		aliquotaEfetiva = totalImpostos*100/somaRendimentos;
		return this.aliquotaEfetiva;
	}
}