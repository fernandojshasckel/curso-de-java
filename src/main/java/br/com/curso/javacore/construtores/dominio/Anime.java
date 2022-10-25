package br.com.curso.javacore.construtores.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime {
    
    private String nome;
    private String tipo;
    private String genero;
    private String studio;
    private int episodios;

    public Anime(){}
    
    public Anime(String nome, String tipo, String genero, int episodios){

        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, String genero, String studio, int episodios){

        this(nome, tipo, genero, episodios);
        this.studio = studio;
    }

    public void imprime() {

        System.out.println(String.format("--- Anime --- \nNome: %s \nTipo: %s \nGenero: %s \nEpisodios: %s",this.nome, this.tipo, this.genero, this.episodios));
    }
}
