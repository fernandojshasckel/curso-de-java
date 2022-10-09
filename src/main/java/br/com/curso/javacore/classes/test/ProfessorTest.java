package br.com.curso.javacore.classes.test;

import br.com.curso.javacore.classes.dominio.Professor;

public class ProfessorTest {
    
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        professor.setNome("Jose");
        professor.setIdade(49);
        professor.setSexo('M');
        
        System.out.println(String.format("Dados do professor \nNome: %s \nIdade: %s \nSexo: %s", 
            professor.getNome(), professor.getIdade(), professor.getSexo()));
    }
}
