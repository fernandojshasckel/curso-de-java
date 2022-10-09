package br.com.curso.javacore.metodos.dominio;

public class Calculadora {
    
    public void somaDeDoisNumeros(){

        int num1 = 10;
        int num2 = 10;
        int soma = num1 + num2;

        System.out.println("A soma de dois números 10 é igual a: " + soma);
    }

    public void subtracaoDeDoisNumeros(){

        int num1 = 20;
        int num2 = 10;
        int subtracao = num1 - num2;

        System.out.println(String.format("A subtração do número %s por %s é igual a: %s",
            num1, num2, subtracao));
    }

    public void multiplicacaoDeDoisNumeros(int num1, int num2){

        int multiplicacao = num1 * num2;

        System.out.println(String.format("O resultado da multiplicação do número %s por %s é de: %s",
            num1, num2, multiplicacao));
    }

    public void divisaoDeDoisNumeros(float num1, float num2){

        float divisao = num1 / num2;

        System.out.println(String.format("O resultado da divisão do número %s por %s é de: %s",
            num1, num2, divisao));
    }
}
