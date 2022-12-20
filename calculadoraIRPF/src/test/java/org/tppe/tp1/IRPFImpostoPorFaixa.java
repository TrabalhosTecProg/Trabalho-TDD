package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFImpostoPorFaixa {
	IRPF irpf = new IRPF();
	@Test
	public void calcularBaseFaixas_9364_82() {
		Map<String, Double> faixaBase = irpf.calcularImpostoPorFaixa();
		
		assertEquals(0d,faixaBase.get("FAIXA_1"));
		assertEquals(69.20,faixaBase.get("FAIXA_2"));
		assertEquals(138.66,faixaBase.get("FAIXA_3"));
		assertEquals(205.57,faixaBase.get("FAIXA_4"));
		assertEquals(1192.21,faixaBase.get("FAIXA_5"));
	}
	
}
