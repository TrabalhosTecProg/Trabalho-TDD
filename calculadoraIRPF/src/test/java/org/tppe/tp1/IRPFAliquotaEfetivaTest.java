package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.tppe.tp1.entities.Deducao;
import org.tppe.tp1.entities.Dependente;
import org.tppe.tp1.entities.Pensao;
import org.tppe.tp1.entities.Rendimento;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;
import org.tppe.tp1.usecases.CadastrarContribuicao;
import org.tppe.tp1.usecases.CadastrarDeducao;
import org.tppe.tp1.usecases.CadastrarPensao;
import org.tppe.tp1.usecases.CadastrarRendimentosPF;
import org.tppe.tp1.usecases.IRPF;

public class IRPFAliquotaEfetivaTest {
	CadastrarRendimentosPF rendimentos = new CadastrarRendimentosPF();
	CadastrarContribuicao contribuicoes = new CadastrarContribuicao();
	CadastrarDeducao deducoes = new CadastrarDeducao();
	CadastrarPensao pensao = new CadastrarPensao();
	List<Dependente> dependentes = new ArrayList<>();
	Dependente filho = new Dependente();
	Dependente filha = new Dependente();
	Dependente neto = new Dependente();
	
	@Test
	public void calcularAliquotaEfetiva_10000() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 100.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 301.23));
		pensao.addPensao(new Pensao(30.00));
		dependentes.add(filho);
		dependentes.add(filha);
		dependentes.add(neto);
		rendimentos.add(new Rendimento("Salario", 10000d));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		irpf.calcularBaseFaixas(irpf.getTotalBaseDeCalculo());
		irpf.calcularImpostoPorFaixa();
		irpf.getTotalImposto();
		
		assertEquals(16.05, irpf.getAliquotaEfetiva(), .01d);
	}
	
	@Test
	public void calcularAliquotaEfetiva_3500() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 56.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 100d));
		pensao.addPensao(new Pensao(90.00));
		dependentes.add(filho);		
		rendimentos.add(new Rendimento("Salario", 3500d));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		irpf.calcularBaseFaixas(irpf.getTotalBaseDeCalculo());
		irpf.calcularImpostoPorFaixa();
		irpf.getTotalImposto();
		
		assertEquals(2.99, irpf.getAliquotaEfetiva(), .01d);
	}

	@Test
	public void calcularAliquotaEfetiva_1200() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 56.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 50d));
		pensao.addPensao(new Pensao(70.00));
		dependentes.add(filho);		
		rendimentos.add(new Rendimento("Salario", 1200d));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		irpf.calcularBaseFaixas(irpf.getTotalBaseDeCalculo());
		irpf.calcularImpostoPorFaixa();
		irpf.getTotalImposto();
		
		assertEquals(0d, irpf.getAliquotaEfetiva(), .01d);
	}
}










