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

    public double divideNumeros(double num1, double num2){

        if (num1 == 0 || num2 ==0){
            
            return 0;
        } else{

            return num1 / num2;
        }
    }

    public void imprimiDivisaoDoisNumeros(double num1, double num2){

        if (num2 == 0) {

            System.out.println("Não existe divisão por 0");
            // Retornando para fora da função
            return;
        }

        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){

        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros){

        int soma = 0;

        for (int i : numeros) {
            
            soma += i;
        }

        System.out.println("O resultado da soma é = " + soma);
    }

    public void somaVarArgs(int... numeros){
        
        int soma = 0;

        for (int i : numeros) {
            
            soma += i;
        }

        System.out.println("O resultado da soma é = " + soma);
    }
}
