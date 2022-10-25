package br.com.curso.javacore.construtores.test;

import br.com.curso.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    
    public static void main(String[] args) {
        
        Anime anime = new Anime("Akudama drive", "TV", "Ação", 12);
        anime.imprime();
    }
}
