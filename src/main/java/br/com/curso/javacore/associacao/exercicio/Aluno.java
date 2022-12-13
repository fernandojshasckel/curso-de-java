package br.com.curso.javacore.associacao.exercicio;

import lombok.Data;

@Data
public class Aluno {
    
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
