package br.com.curso.javacore.associacao.exercicio;

import lombok.Data;

@Data
public class Seminario {
    
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Seminário: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println(" Lista de alunos cadastrados ");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", idade: " + aluno.getIdade() + " anos");
        }
    }

}
