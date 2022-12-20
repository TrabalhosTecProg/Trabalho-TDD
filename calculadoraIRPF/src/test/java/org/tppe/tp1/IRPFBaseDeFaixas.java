package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFBaseDeFaixas {
	IRPF irpf = new IRPF();
	@Test
	public void calcularBaseFaixas() {
		Map<String, Double> faixaBase = irpf.calcularBaseFaixas(9364.82d);
		
		assertEquals(1903.98,faixaBase.get("FAIXA_1"));
		assertEquals(922.67,faixaBase.get("FAIXA_2"));
		assertEquals(924.40,faixaBase.get("FAIXA_3"));
		assertEquals(913.63,faixaBase.get("FAIXA_4"));
		assertEquals(4700.14,faixaBase.get("FAIXA_5"));
	}

}
