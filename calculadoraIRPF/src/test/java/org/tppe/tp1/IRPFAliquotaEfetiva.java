package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.usecases.IRPF;

public class IRPFAliquotaEfetiva {
	IRPF irpf = new IRPF();
	
	@Test
	public void calcularAliquotaEfetiva() {
		irpf.calcularBaseFaixas(9000d);
		irpf.calcularImpostoPorFaixa();
		assertEquals(18.80, irpf.getAliquotaEfetiva(), .01d);
	}
}
