package br.com.curso.javacore.sobrecargametodos.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime {
    
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    public void init(String nome, String tipo, int episodios) {

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, String genero, int episodios) {

        init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {

        System.out.println(String.format("--- Anime --- \nNome: %s \nTipo: %s \nGenero: %s \nEpisodios: %s",this.nome, this.tipo, this.genero, this.episodios));
    }
}
