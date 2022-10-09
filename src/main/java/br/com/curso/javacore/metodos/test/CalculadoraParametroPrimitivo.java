package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Calculadora;

public class CalculadoraParametroPrimitivo {
    
    public static void main(String[] args) {
        
        int num1 = 1;
        int num2 = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da calculadora");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
