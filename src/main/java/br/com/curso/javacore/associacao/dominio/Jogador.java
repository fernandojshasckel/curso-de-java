package br.com.curso.javacore.associacao.dominio;

import lombok.Data;

@Data
public class Jogador {
    
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        }
    }

}
