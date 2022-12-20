package org.tppe.tp1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
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

public class IRPFTest {
	
	
	@Test
	void testeBaseDeCalculo() throws DescricaoEmBrancoException, ValorContribuicaoInvalidoException {
		CadastrarRendimentosPF rendimentos = new CadastrarRendimentosPF();
		rendimentos.add(new Rendimento("Salario", 5000d));
		
		CadastrarContribuicao contribuicoes = new CadastrarContribuicao();
		contribuicoes.add("INSS", 100.00);
		
		CadastrarDeducao deducoes = new CadastrarDeducao();
		deducoes.addDeducao(new Deducao("Previdencia Privada", 200.00));
		
		CadastrarPensao pensao = new CadastrarPensao();
		pensao.addPensao(new Pensao(300.00));
		
		List<Dependente> dependentes = new ArrayList<>();
		Dependente filho = new Dependente();
		Dependente filha = new Dependente();
		dependentes.add(filho);
		dependentes.add(filha);
		
		IRPF irpf = new IRPF();
		Double baseDeCalculo = irpf.baseDeCalculo(rendimentos, contribuicoes, deducoes, pensao, dependentes);
		assertEquals(4020.82d, baseDeCalculo);
	}

}
