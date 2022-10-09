package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Calculadora;

public class CalculadoraRetorno {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideNumeros(20, 2);
    }
}
