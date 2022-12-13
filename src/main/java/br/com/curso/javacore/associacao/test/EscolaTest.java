package br.com.curso.javacore.associacao.test;

import br.com.curso.javacore.associacao.dominio.Escola;
import br.com.curso.javacore.associacao.dominio.Professor;

public class EscolaTest {
    
    public static void main(String[] args) {
     
        Professor professor = new Professor();
        professor.setNome("Fernando");
        Professor[] professores = {professor};       
        Escola escola = new Escola("Konoha", professores);
        
        escola.imprime();
    }

}
