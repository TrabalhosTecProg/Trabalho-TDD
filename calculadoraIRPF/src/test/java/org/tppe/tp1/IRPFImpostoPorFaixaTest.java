package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFImpostoPorFaixaTest {
	IRPF irpf = new IRPF();
	@Test
	public void calcularImpostoPorFaixa_9000() {
		irpf.calcularBaseFaixas(9000d);
		irpf.calcularImpostoPorFaixa();
		Map<String, Double> faixaBase = irpf.getImpostoPorFaixa();
		
		assertEquals(0d,faixaBase.get("FAIXA_1"), .01d);
		assertEquals(69.20,faixaBase.get("FAIXA_2"), .01d);
		assertEquals(138.66,faixaBase.get("FAIXA_3"), .01d);
		assertEquals(205.57,faixaBase.get("FAIXA_4"), .01d);
		assertEquals(1192.21,faixaBase.get("FAIXA_5"), .01d);
	}
	
	@Test
	public void calcularImpostoPorFaixa_2000() {
		irpf.calcularBaseFaixas(2000d);
		irpf.calcularImpostoPorFaixa();
		Map<String, Double> faixaBase = irpf.getImpostoPorFaixa(); 
		
		assertEquals(0d,faixaBase.get("FAIXA_1"), .01d);
		assertEquals(7.20,faixaBase.get("FAIXA_2"), .01d);
		assertEquals(0d,faixaBase.get("FAIXA_3"), .01d);
		assertEquals(0d,faixaBase.get("FAIXA_4"), .01d);
		assertEquals(0d,faixaBase.get("FAIXA_5"), .01d);
	}
	
	@Test
	public void calcularImpostoPorFaixa_4000() {
		irpf.calcularBaseFaixas(4000d);
		irpf.calcularImpostoPorFaixa();
		Map<String, Double> faixaBase = irpf.getImpostoPorFaixa(); 
		
		assertEquals(0d,faixaBase.get("FAIXA_1"), .01d);
		assertEquals(69.20,faixaBase.get("FAIXA_2"), .01d);
		assertEquals(138.66d,faixaBase.get("FAIXA_3"), .01d);
		assertEquals(56.01d,faixaBase.get("FAIXA_4"), .01d);
		assertEquals(0d,faixaBase.get("FAIXA_5"), .01d);
	}
	
	
	
}
