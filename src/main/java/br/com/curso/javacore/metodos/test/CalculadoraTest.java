package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        // Chamando as funções simples
        calculadora.somaDeDoisNumeros();
        calculadora.subtracaoDeDoisNumeros();
    }
}
