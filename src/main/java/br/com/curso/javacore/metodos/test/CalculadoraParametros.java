package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Calculadora;

public class CalculadoraParametros {
    
    public static void main(String[] args) {
    
        Calculadora calculadora = new Calculadora();    
        // Chamando as funções com passagem de argumentos
        calculadora.multiplicacaoDeDoisNumeros(3,2);
        calculadora.divisaoDeDoisNumeros(10, 2);
    }
}
