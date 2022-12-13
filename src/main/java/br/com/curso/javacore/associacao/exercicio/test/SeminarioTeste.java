package br.com.curso.javacore.associacao.exercicio.test;

import br.com.curso.javacore.associacao.exercicio.Professor;
import br.com.curso.javacore.associacao.exercicio.Seminario;
import br.com.curso.javacore.associacao.exercicio.Local;
import br.com.curso.javacore.associacao.exercicio.Aluno;

public class SeminarioTeste {
    
    public static void main(String[] args) {


        Aluno aluno = new Aluno("Fernando", 20);
        Aluno aluno2 = new Aluno("Lucas", 21);
        Aluno aluno3 = new Aluno("Daniel", 18);
        Aluno[] alunos = new Aluno[]{aluno, aluno2, aluno3};

        Local local = new Local("AV. Brasil");

        Seminario seminario = new Seminario("Seminario teste", local, alunos);
        Seminario seminario2 = new Seminario("Seminario teste2", local, alunos);
        Seminario[] seminarios = new Seminario[]{seminario, seminario2};

        Professor professor = new Professor("Antonio", "Programação", seminarios);

        aluno.imprime();
        seminario.imprime();
        seminario2.imprime();
        professor.imprime();

    }

}
