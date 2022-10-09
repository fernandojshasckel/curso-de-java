package br.com.curso.javacore.metodos.test;

import br.com.curso.javacore.metodos.dominio.Estudante;
import br.com.curso.javacore.metodos.dominio.ImprimeEstudante;

public class EstudanteTest {
    
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        estudante.setNome("Julio");
        estudante.setIdade(19);
        estudante.setSexo('M');

        Estudante estudante2 = new Estudante();
        estudante2.setNome("Matias");
        estudante2.setIdade(23);
        estudante2.setSexo('M');

        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();
        imprimeEstudante.imprime(estudante);
        imprimeEstudante.imprime(estudante2);
    }
}
