package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Estudante;

public class EstudanteTestThis {
    
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        estudante.setNome("Felipe");
        estudante.setIdade(12);
        estudante.setSexo('M');
        estudante.imprime();
    }
}
