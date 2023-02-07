As 5 características escolhidas pelo grupo foram:

1. Simplicidade;


# 1. Simplicidade
## 1.1 Descrição

A simplicidade dos códigos de software é uma característica fundamental na construção de sistemas de alta qualidade. De acordo com a norma ABNT NBR ISO/IEC 9126-1, a simplicidade é definida como uma medida de facilidade de uso e compreensão do software. Código simples é mais fácil de entender, manter e modificar, reduzindo erros e tempo gasto em correções. Além disso, a simplicidade também ajuda a garantir a escalabilidade do software, o que facilita a inclusão de novos recursos no futuro. Em suma, a simplicidade dos códigos de software é essencial para  a eficiência, confiabilidade e manutenibilidade dos sistemas.

Existem diversas operações que ajudam a atingir uma boa simplicidade do código. Sendo algumas operações de refatorações como: dividir métodos longos, reduzir classes inchadas, extrair métodos, fazer uso de nomes claros para as variáveis. Dessa forma, a característica de simplicidade poderia ser aplicada ao fazer a extração de método do isLimiteValido em todas as suas ocorrências. Essa operação inclusive também colabora com a redução da duplicidade que será abordada posteriormente.

## 1.2 Aplicação

A simplicidade foi explorada com a extração de método do isLimiteValido que aparece em diversas classes, deixando o código mais fácil de entender e mais simples. A refatoração está disponível na branch 'refatoracao' referente ao TP2. Também explorada com o uso de nomes claros de variáveis.

![Refatoração de simplicidade 1](./assets/islimit1.png)

<figcaption>Fonte: Método repetido em várias classes</figcaption>

![Refatoração de simplicidade 2](./assets/islimit2.png)

<figcaption>Fonte: Extração do método em classe separada </figcaption>

![nomes claros de variaveis](./assets/nomes_claros.png)
<figcaption>Fonte: Nomes claros de variáveis </figcaption>

















# Referências

ABNT NBR ISO/IEC 9126-1:2001. Informática - Avaliação de qualidade de software - Parte 1: Modelo de avaliação. Brasília: ABNT, 2001.