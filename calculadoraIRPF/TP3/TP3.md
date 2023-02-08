As 5 características escolhidas pelo grupo foram:

1. Simplicidade;
2. Ausência de Duplicidade;

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















# Referências

ABNT NBR ISO/IEC 9126-1:2001. Informática - Avaliação de qualidade de software - Parte 1: Modelo de avaliação. Brasília: ABNT, 2001.