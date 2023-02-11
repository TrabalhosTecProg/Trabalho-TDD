Correção Tp1
--

|   |Critério                                             |Nota(%) |Nota(ptos)|
|---|-----------------------------------------------------|--------|----------|  
| 1 |Ref.1: Extrair método (10 pts)                       |   80   |    08    |  
| 2 |Ref.2: Substituir método por objeto-método (15 pts)  |   60   |    09    |  
| 3 |Ref.3: Extrair constante (5 pts)                     |  100   |    05    |  
|   |**Total**                                            |        |    22    |  

* Observações:
  Refatoração 1 reduziu código duplicado, mas para cada utilização de
isLimiteValido há um objeto instanciado. Por que não usaram um método estático?
(-20%)
  Refatoracao 2 não utilizou referencia para o objeto de origem mas passou cópia
dos elementos do objeto de origem (-20%). Chamada do método-objeto feita
diversas vezes ao invés de uma única chamada (-20%).
