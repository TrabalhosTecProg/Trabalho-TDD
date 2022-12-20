package org.tppe.tp1.entities;

import java.util.LinkedHashMap;
import java.util.Map;

public class FaixasDeBase {
	private final Map<String, Double> LIMITES_FAIXA_BASE = new LinkedHashMap<String, Double>();
	private final Map<String, Double> ALIQUOTA_FAIXA_BASE = new LinkedHashMap<String, Double>();
	
	
	public FaixasDeBase() {
		LIMITES_FAIXA_BASE.put("FAIXA_1", 1903.98d);
		LIMITES_FAIXA_BASE.put("FAIXA_2", 922.67d);
		LIMITES_FAIXA_BASE.put("FAIXA_3", 924.40d);
		LIMITES_FAIXA_BASE.put("FAIXA_4", 913.63d);
		LIMITES_FAIXA_BASE.put("FAIXA_5", Double.MAX_VALUE);
		
		ALIQUOTA_FAIXA_BASE.put("FAIXA_1", 0d);
		ALIQUOTA_FAIXA_BASE.put("FAIXA_2", 7.5d);
		ALIQUOTA_FAIXA_BASE.put("FAIXA_3", 15d);
		ALIQUOTA_FAIXA_BASE.put("FAIXA_4", 22.5d);
		ALIQUOTA_FAIXA_BASE.put("FAIXA_5", 27.5d);
	}
	
	public Map<String, Double> getLimitesFaixaBase(){
		return this.LIMITES_FAIXA_BASE;
	}
	
	public Map<String, Double> getAliquotaFaixaBase(){
		return this.ALIQUOTA_FAIXA_BASE;
	}
}
