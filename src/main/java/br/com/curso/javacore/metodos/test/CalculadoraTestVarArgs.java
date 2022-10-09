package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Calculadora;

public class CalculadoraTestVarArgs {
    
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5};
        Calculadora calculadora = new Calculadora();
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
