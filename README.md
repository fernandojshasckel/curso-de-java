# Curso de JAVA

   ### Tipos primitivos
    
    - Temos oito tipos primitivos, são eles que vão guardar em memoria um valor 
      simples.
      
      int, double, float, char, byte, short, long, boolean
       
      - Quase todas os tipos com exceção do boleano são numericos.
      - A diferença entre eles é a quantidade que consigo alocar em memória.
        
      - O caracter traduz o que é passado para a tabela ascii
      Por exemplo se eu atribuir o valor 87 a minha variavel que é do tipo char
      eu vou ter armazenado 'W' que é o que está como 87 na tabela
      
      Se eu desejar usar um valor unicode vou precisar adicionar o '\' asntes do valor
      por exemplo se eu atribuir o valor '\0041' a minha variavel do tipo char
      eu vou ter armazenado o valor 'A'.
      
    - Quando eu forço uma variavel receber um valor de tipo diferente chamamos de cast

    - Quando trabalho com valores de moeda é interessante utilizar BigDecimal.

   ### Operadores aritiméticos
   
    - São elementos que permitem que seja possivel fazer operações.
    
    - Por exemplo os operadores aritimeticos
    São operadores que quando utilizados permitem que  seja possivel realizar operações 
    aritimeticas.
    
    Como operadores temos
    
    - Soma: + 
    - Subtração: - 
    - Divisão: / 
    - Multiplicação: *
    
    - O resultado de uma operação com números inteiros sempre será um inteiro
    Por exemplo se eu dividir 10 para 20 não terei o resultado de 0.5 e sim um resultado
    de 0.
     
   ### Operadores relacionais
   
    - O operador de resto é o sinal de porcentagem '%'
    Utilizo o resto da divisão por exemplo para indicar se um número é par ou impar.
    
    - Sempre retornam um valor boleano
    
    Como operadores lógicos temos:
    Menor: <
    Maior: >
    Menor igual: <=
    Maior igual: >=
    Igual: == 
    Diferente: !=

   ### Operadores lógicos
   
    - Utilizados com estruturas condicionais
    - Temos três tipos
    
    E: &&
    Ou: ||
    Negação: !
    
   ### Operadores de atribuição

    - Como o proprio nome ja diz são operadores para a atribuição de valores a sua variavel

    Atribuição: =
    Atribuição com soma: +=
    Atribuição com subtração: -=
    Atribuição com multiplicação: *=
    Atribuição com divisão: /=
    Atribuição com resto: %=
   
   ### Estruturas condicionais if/else

    - Dentro da estrutura condicional tenho que sempre fazer com que a comparação retorne em boleano

   ### Estruturas condicionais Switch

    - Quando utilizo switch a variavel deve ser de um dos seguintes tipos:
      - char
      - int
      - byte
      - short
      - enum
      - String
    
    - Utilizo o "break"por que se não a hora que a condição for atendida daquela em diante será executada,
    já com o break a execução é interompida e acontece so o que está dentro do case onde a condição foi atendida

    - Utilizo o default para caso nenhuma das opções for atendida vai ser rodado o que está no default