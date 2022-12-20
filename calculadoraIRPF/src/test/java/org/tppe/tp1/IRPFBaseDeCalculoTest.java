package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

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

public class IRPFBaseDeCalculoTest {
	
	CadastrarContribuicao contribuicoes = new CadastrarContribuicao();
	CadastrarDeducao deducoes = new CadastrarDeducao();
	CadastrarPensao pensao = new CadastrarPensao();
	List<Dependente> dependentes = new ArrayList<>();
	Dependente filho = new Dependente();
	Dependente filha = new Dependente();
	
	@Test
	void testeBaseDeCalculo_5000() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 100.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 200.00));
		pensao.addPensao(new Pensao(300.00));
		dependentes.add(filho);
		dependentes.add(filha);
		
		CadastrarRendimentosPF rendimentos = new CadastrarRendimentosPF();
		rendimentos.add(new Rendimento("Salario", 5000d));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		Double baseDeCalculo = irpf.getTotalBaseDeCalculo();
		assertEquals(4020.82d, baseDeCalculo, .01d);
	}
	
	@Test
	void testeBaseDeCalculo_7000() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 200.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 400.00));
		pensao.addPensao(new Pensao(1200.00));
		dependentes.add(filho);
		dependentes.add(filha);
		
		CadastrarRendimentosPF rendimentos = new CadastrarRendimentosPF();
		rendimentos.add(new Rendimento("Salario", 7000d));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		Double baseDeCalculo = irpf.getTotalBaseDeCalculo();
		assertEquals(4820.82d, baseDeCalculo, .01d);
	}
	
	@Test
	void testeBaseDeCalculo_2500() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		contribuicoes.add("INSS", 56.00);
		deducoes.addDeducao(new Deducao("Previdencia Privada", 100.00));
		pensao.addPensao(new Pensao(100.00));
		dependentes.add(filho);
		dependentes.add(filha);
		
		CadastrarRendimentosPF rendimentos = new CadastrarRendimentosPF();
		rendimentos.add(new Rendimento("Salario", 2500));
		
		IRPF irpf = new IRPF();
		irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		Double baseDeCalculo = irpf.getTotalBaseDeCalculo();
		assertEquals(1864.82d, baseDeCalculo, .01d);
	}

}
