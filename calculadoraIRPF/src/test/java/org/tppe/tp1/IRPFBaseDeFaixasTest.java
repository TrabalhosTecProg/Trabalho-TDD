package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFBaseDeFaixasTest {
	IRPF irpf = new IRPF();
	@Test
	public void calcularBaseFaixas_9364_82() {
		irpf.calcularBaseFaixas(9364.82d);
		Map<String, Double> faixaBase = irpf.getBaseFaixas();
		
		assertEquals(1903.98,faixaBase.get("FAIXA_1"));
		assertEquals(922.67,faixaBase.get("FAIXA_2"));
		assertEquals(924.40,faixaBase.get("FAIXA_3"));
		assertEquals(913.63,faixaBase.get("FAIXA_4"));
		assertEquals(4700.14,faixaBase.get("FAIXA_5"));
	}
	
	@Test
	public void calcularBaseFaixas_2744() {
		irpf.calcularBaseFaixas(2744d);
		Map<String, Double> faixaBase = irpf.getBaseFaixas(); 
		
		assertEquals(1903.98,faixaBase.get("FAIXA_1"));
		assertEquals(840.02,faixaBase.get("FAIXA_2"));
		assertEquals(0d,faixaBase.get("FAIXA_3"));
		assertEquals(0d,faixaBase.get("FAIXA_4"));
		assertEquals(0d,faixaBase.get("FAIXA_5"));
	}
	
	@Test
	public void calcularBaseFaixas_1900() {
		irpf.calcularBaseFaixas(1900d);
		Map<String, Double> faixaBase = irpf.getBaseFaixas();
		
		assertEquals(1900d,faixaBase.get("FAIXA_1"));
		assertEquals(0d,faixaBase.get("FAIXA_2"));
		assertEquals(0d,faixaBase.get("FAIXA_3"));
		assertEquals(0d,faixaBase.get("FAIXA_4"));
		assertEquals(0d,faixaBase.get("FAIXA_5"));
	}

}
