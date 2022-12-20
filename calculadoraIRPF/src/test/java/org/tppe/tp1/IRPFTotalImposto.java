package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFTotalImposto {
	IRPF irpf = new IRPF();
	
	@Test
	public void calcularImpostoTotal_4000() {
		irpf.calcularBaseFaixas(4000d);
		irpf.calcularImpostoPorFaixa();
		Double totalImposto = irpf.getTotalImposto();
		
		assertEquals(263.87, totalImposto, .01d);
	}
	
	@Test
	public void calcularImpostoTotal_2000() {
		irpf.calcularBaseFaixas(2000d);
		irpf.calcularImpostoPorFaixa();
		Double totalImposto = irpf.getTotalImposto();
		
		assertEquals(7.20, totalImposto, .01d);
	}
	
	@Test
	public void calcularImpostoTotal_10000() {
		irpf.calcularBaseFaixas(10000d);
		irpf.calcularImpostoPorFaixa();
		Double totalImposto = irpf.getTotalImposto();
		
		assertEquals(1880.64, totalImposto, .01d);
	}
}
