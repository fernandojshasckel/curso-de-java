package br.com.curso.javacore.associacao.dominio;

import lombok.Data;

@Data
public class Escola {
    
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }
    
    public void imprime() {
        System.out.println("Nome Escola: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }
    }
}
