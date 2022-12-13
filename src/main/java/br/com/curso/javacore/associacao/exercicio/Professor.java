package br.com.curso.javacore.associacao.exercicio;

import lombok.Data;

@Data
public class Professor {
    
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminários a serem ministrados");
        for (Seminario seminario : seminarios) {
            System.out.println("Seminario: " + seminario.getTitulo());
        }
    }

}
