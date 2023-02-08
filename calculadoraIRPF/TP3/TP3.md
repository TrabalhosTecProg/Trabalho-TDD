As 6 características escolhidas pelo grupo foram:

1. Simplicidade;
2. Ausência de Duplicidade;
3. Elegância;
4. Modularidade;
5. Boa Documentação;
6. Boa Interface.

# 1. Simplicidade
## 1.1 Descrição

A simplicidade dos códigos de software é uma característica fundamental na construção de sistemas de alta qualidade. De acordo com a norma ABNT NBR ISO/IEC 9126-1, a simplicidade é definida como uma medida de facilidade de uso e compreensão do software. Código simples é mais fácil de entender, manter e modificar, reduzindo erros e tempo gasto em correções. Além disso, a simplicidade também ajuda a garantir a escalabilidade do software, o que facilita a inclusão de novos recursos no futuro. Em suma, a simplicidade dos códigos de software é essencial para  a eficiência, confiabilidade e manutenibilidade dos sistemas.

Existem diversas operações que ajudam a atingir uma boa simplicidade do código. Sendo algumas operações de refatorações como: dividir métodos longos, reduzir classes inchadas, extrair métodos, fazer uso de nomes claros para as variáveis. Dessa forma, a característica de simplicidade poderia ser aplicada ao fazer a extração de método do isLimiteValido em todas as suas ocorrências. Essa operação inclusive também colabora com a redução da duplicidade que será abordada posteriormente.

## 1.2 Aplicação

A simplicidade foi explorada com a extração de método do isLimiteValido que aparece em diversas classes, deixando o código mais fácil de entender e mais simples. A refatoração está disponível na branch 'refatoracao' referente ao TP2. Também explorada com o uso de nomes claros de variáveis.

<figcaption>Método repetido em várias classes</figcaption>

![Refatoração de simplicidade 1](./assets/islimit1.png)


<figcaption> Extração do método em classe separada </figcaption>

![Refatoração de simplicidade 2](./assets/islimit2.png)

<figcaption>Nomes claros de variáveis </figcaption>

![nomes claros de variaveis](./assets/nomes_claros.png)

# 2. Ausência de Duplicidade

## 2.1 Descrição

Código duplicado é uma prática de programação ruim que ocorre quando o mesmo código é repetido várias vezes no mesmo programa. Isso torna o código confuso, difícil de manter e sujeito a erros, porque toda vez que o código precisa ser alterado, ele precisa ser alterado em todas as instâncias em que ocorre. Além disso, a duplicação de código aumenta o tamanho do arquivo e afeta negativamente o desempenho do programa. Com isso, a solução para a duplicidade de código é refatorar o código para criar funções ou classes reutilizáveis ​​e apropriadas, ou seja, a ausência de duplicidades.

## 2.2 Aplicação

A ausência de duplicidade foi exercida e explorada no trabalho 2 com a extração do código isLimite, que aparecia como método em diversas classes, sendo extraida e transformada em um classe. A refatoração desta característica pode ser encontrada na branch 'refatoracao' referente ao TP2.


<figcaption>Método repetido em várias classes</figcaption>

![Refatoração de ausência de duplicidade](./assets/islimit1.png)


<figcaption> Extração do método em classe separada </figcaption>

![Refatoração de ausência de duplicidade](./assets/islimit2.png)

# 3. Elegência

## 3.1 Descrição

A elegância na refatoração refere-se à capacidade de reescrever ou reorganizar o código de maneira clara, concisa e eficiente, sem alterar o comportamento pretendido do programa. Isso é importante porque ajuda a tornar o código fácil de entender, manter e estender, o que melhora a qualidade e a confiabilidade do programa. A refatoração otimizada também pode melhorar o desempenho e a eficiência do código porque a eliminação da duplicação de código, a simplificação da lógica e o aproveitamento de funções e classes existentes ajudam a evitar o desperdício de recursos de computação.

## 3.2 Aplicação 

A característica de elegência também foi aplicada no Trabalho 2, um exemplo foi na transformação de um método em método objeto, tornando mais fácil sua reutilização, organização do código, clareza e outros, sem alterar o comportamento do projeto. A refatoração desta característica também pode ser encontrada na branch 'refatoracao' referente ao TP2.


<figcaption> Método na classe Cadastrar Contribuição </figcaption>

![Método](./assets/metodo.jpeg)


<figcaption> Transformação em método objeto </figcaption>

![Método objeto](./assets/metodo_objeto.jpeg)


# 4. Modularidade

## 4.1 Descrição
Modularidade é uma prática importante em um bom projeto de software visto que ajuda a manter o código organizado, legível e de fácil manutenção. Uma boa modularidade consiste em dividir o projeto em módulos ou componentes independentes, cada um com sua própria responsabilidade e interface pública bem definida. Isso tem vários efeitos positivos no código, tais como: fácil entendimento e navegação pelo código, aumentando a rastreabilidade; melhor coesão, facilitando a divisão do projeto e, consequentemente, a manutenção do mesmo; baixo acoplamento, visto que manter os módulos independentes faz com que evite dependências excessivas entre eles; reutilização, já que módulos bem projetados podem ser facilmente reutilizados economizando tempo e esforço.

Em resumo, a boa modularidade pode levar a um código mais organizado, claro, coeso, facilmente mantido e escalável, tornando o desenvolvimento de software mais eficiente e eficaz.

## 4.2 Aplicação 

No desenvolvimento dos trabalhos na disciplina, o grupo optou por utilizar a arquitetura Clean Architecture, que é uma arquitetura de projeto bem modularizada, em que basicamente há várias camadas de modelagem. A arquitetura busca separar a lógica de negócios da lógica estrutural, aumentando a independência e a coesão entre camadas, permitindo que a mudança não afete a lógica de negócio,visto que também possui baixo acoplamento. 

Um exemplo prático que utilizamos no decorrer dos trabalhos, pode ser analisado na imagem abaixo, em que as entidades são bem definidas e isoladas das funções de negócio, que ficam no diretório usecases, além do controller que faz a comunicação entre eles. Além do isolamento das exceptions e utils - para armazenar funções isoladas que podem ser úteis em várias partes do código.

<a href="https://ibb.co/6yHCQhy"><img src="https://i.ibb.co/GdWSmwd/tppe-Screenshot-from-2023-02-08-00-29-04.png" alt="tppe-Screenshot-from-2023-02-08-00-29-04" border="0"></a><br /><a target='_blank' href='https://pt-br.imgbb.com/'></a><br />

# 5. Boa Documentação

## 5.1. Descrição

Uma documentação de software deve ser uma descrição precisa sobre o sistema, apresentando importantes informações como seus objetivos e utilização, facilitando tanto o uso da equipe atual quanto de possíveis futuros membros. Consiste em um conjunto de manuais gerais e técnicos que torna o gerenciamento do projeto mais organizado, eficiente e até mesmo mais rápido.

Pode-se dizer que a documentação do projeto é algo vivo, pois é aperfeiçoada e adaptada ao longo do tempo, do mesmo jeito que a própria colaboração e produtividade da equipe se adéqua durante o ciclo de vida de uma aplicação. 

Em termos gerais, documentações precisam ter três elementos:

* contextualização de problema: informa cada obstáculo durante o desenvolvimento e em que situação ele ocorreu;
* contextualização de solução: explica as modificações feitas em processos ou no código que corrigiram o problema;
* detalhes técnicos: familiarizam o responsável por aquela parte do desenvolvimento sobre como, quando e por que aquela intervenção foi realizada.


É possível fazer uma relação com o mau-cheiro de código *comentários* definido por Fowler, pois com uma boa documentação os comentários são reduzidos e se tornam menos necessários para um bom entendimento do sistema.


## 5.2. Aplicação
A utilização das boas práticas de documentação citadas podem ser claramente visualizadas no [Readme](https://github.com/TrabalhosTecProg/Trabalho-TDD/blob/main/README.md) do projeto, encontrado na página principal do [repositório](https://github.com/TrabalhosTecProg/Trabalho-TDD).

# 6 - Boas Interfaces

## 6.1 Descrição

Uma outra característica importante para um bom design de código é o uso de **Boas Interfaces**. Significa uma maneira de definir uma forma de comunicação padronizada para utilização de um módulo do programa ou sistema. A interface é um dos fatores que determina a qualidade do seu código visto por fora já que é a única maneira de acessar o módulo externamente, ou seja, uma API (*Application Programming Interface*).  Isso permite uma série de características como:

- **Particionamento**:  Uma separação das funcionalidades de cliente e implementador;
- **Abstração**: A interface funciona como uma caixa preta, permitindo usar as funcionalidades sem o necessário entendimento de como foi implementado;
- **Compressão**: Associada a uma boa abstração. Te permite fazer mais com menos linhas de código, por exemplo, eliminando duplicações;
- **Substituibilidade**: Contratos de interface iguais permitem que possa ser trocados um pelo outro, mesmo que suas implementações sejam completamente diferentes.

Os passos básicos para definir uma interface, como exposto por Pete Goodliffe (2006) são:

- Identificar o cliente e o que ele quer;
- Identificar o implementador e o que ele pode fazer;
- Inferir o tipo de interface. Existem tipos de interface como de rede, de classes e de funções;
- Determinar a natureza da operação. As características a cima podem ser um guia para determinar, bem como padrões de design e arquitetura.

## 6.2 Aplicação

Um mal-cheiro que foi identificado foi a duplicação de código para as classes de entidade que provavelmente pertencem a um mesmo domínio, como exemplo as classes de dependentes e contribuição que são ambos tipos de Dedução.

Para remediar, fizemos os seguintes passos:

- Criação de uma interface `DeducaoI`:

```java
package org.tppe.tp1.entities.interfaces;

import org.tppe.tp1.entities.TipoDeducao;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

public interface DeducaoI {
    public TipoDeducao getType();
    public String getDescricao();
    public double getValor();
    public void setDescricao(String descricao) throws DescricaoEmBrancoException;
    public void setValor(double valor);
    public void checkValor(double valor) throws ValorDeducaoInvalidoException;
    Boolean isLimiteValido(Double valor);
}
```

- Uma classe abstrata `DeducaoDefault` que implementa alguns dos métodos:

```java
package org.tppe.tp1.entities;

import org.tppe.tp1.entities.interfaces.DeducaoI;
import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

public abstract class DeducaoDefault implements DeducaoI{
    private String descricao;
    private double valor ;

    public DeducaoDefault() {}
    public DeducaoDefault(String descricao, double valor) {
        this.descricao= descricao;
        this.valor= valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) throws DescricaoEmBrancoException{
        if (descricao==null || descricao.isBlank())
            throw new DescricaoEmBrancoException(
                    "Descricao de deducao não pode estar em branco!");
        this.descricao= descricao;
    }
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Boolean isLimiteValido(Double valor) {
        return (valor > 0.0D && valor < Double.MAX_VALUE);
    }
}
```

- A classes `Deducao`, `ContribuicaoPrevidenciaria`, `Dependentes` e `Pensao` ficaram da seguinte maneira:

```java
// Classe Deducao
package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;

public class Deducao extends DeducaoDefault {
	private String descricao;	
	private double valor ;

	public Deducao() {}
	public Deducao(String descricao, double valor) {
		super(descricao, valor);
	}
	public TipoDeducao getType() {return TipoDeducao.OUTRO;}

	public void checkValor(double valor)  throws ValorDeducaoInvalidoException{
		if (!(isLimiteValido(valor))) {
	        throw new ValorDeducaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	    }
		super.setValor(valor);
	}
}

//Classe 
package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.DescricaoEmBrancoException;
import org.tppe.tp1.exceptions.ValorContribuicaoInvalidoException;



public class ContribuicaoPrevidenciaria extends DeducaoDefault{

	public ContribuicaoPrevidenciaria() {
		super();
	}
	public ContribuicaoPrevidenciaria(String descricao, double valor) {
		super(descricao, valor);
	}

	public TipoDeducao getType() {
		return TipoDeducao.PREVIDENCIA;
	}
	public void checkValor(double valor) throws ValorContribuicaoInvalidoException {
		 if (isLimiteValido(valor)) {
	           super.setValor(valor);
	       }
	       else {
	           throw new ValorContribuicaoInvalidoException(
	                   "Valores negativos ou maiores do que INF são inválidos");
	       }
	}
}

// Dependente
package org.tppe.tp1.entities;
import java.time.LocalDate;

import org.tppe.tp1.exceptions.NomeEmBrancoException;
import org.tppe.tp1.exceptions.ValorDeducaoInvalidoException;


public class Dependente extends DeducaoDefault{
	
	private String nome;	
	private LocalDate data ;
	public static final double DEDUCAO_DEPENDENTE = 189.59d;
	
	public Dependente() {}
	public Dependente(String nome, LocalDate data) {
		super("Dependente", DEDUCAO_DEPENDENTE);
		this.nome= nome;
		this.data= data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeEmBrancoException {
		 if (nome==null||nome.isEmpty() || nome.isBlank()) 
	            throw new NomeEmBrancoException(
	                "Nome de dependente não pode estar em branco!"); 
		 this.nome= nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	public void checkValor(double valor) throws ValorDeducaoInvalidoException {
		if (valor != DEDUCAO_DEPENDENTE) {
			throw new ValorDeducaoInvalidoException(
					"Valores negativos ou maiores do que INF são inválidos");
		}
	}
	public TipoDeducao getType() {return TipoDeducao.DEPENDENTE;}
	
}

// Pensao
package org.tppe.tp1.entities;

import org.tppe.tp1.exceptions.ValorPensaoInvalidoException;

public class Pensao extends DeducaoDefault {
	
	public Pensao() {
		super();
	}
	
	public Pensao(double valor) {
		super("Pensão", valor);
	}
	public void checkValor(double valor)  throws ValorPensaoInvalidoException{
		if (!(isLimiteValido(valor))) {
			throw new ValorPensaoInvalidoException(
					"Valores negativos ou maiores do que INF são inválidos");
		}
		super.setValor(valor);
	}
	
	public TipoDeducao getType() { return TipoDeducao.OUTRO; }
	
}

```

Com essas refatorações, ocorreu uma diminuição da duplicação de código e a definição de uma abstração que agora pode ser usada para cadastrar e calcular deduções, independentemente do tipo delas.

# Referências

ABNT NBR ISO/IEC 9126-1:2001. Informática - Avaliação de qualidade de software - Parte 1: Modelo de avaliação. Brasília: ABNT, 2001.

Code Craft : The Practice of Writing Excellent Code, No Starch Press, Incorporated, 2006. ProQuest Ebook Central
