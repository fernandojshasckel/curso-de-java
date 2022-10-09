package br.com.curso.javacore.classes.test;

import br.com.curso.javacore.classes.dominio.Estudante;

public class EstudanteTest {
    
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        estudante.setNome("Fernando");
        estudante.setIdade(20);
        estudante.setSexo('M');
    }
}
