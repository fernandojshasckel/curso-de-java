package br.com.curso.javacore.associacao.dominio;

import lombok.Data;

@Data
public class Time {
    
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        
        System.out.println("Nome do time: " + this.nome);
        if (this.jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getNome());
        }

    }

}
