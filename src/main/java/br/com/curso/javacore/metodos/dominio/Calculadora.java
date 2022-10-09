package br.com.curso.javacore.metodos.dominio;

public class Calculadora {
    
    public void somaDoisNumeros(){

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
}
