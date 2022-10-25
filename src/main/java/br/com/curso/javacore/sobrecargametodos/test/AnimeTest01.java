package br.com.curso.javacore.sobrecargametodos.test;

import br.com.curso.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    
    public static void main(String[] args) {
        
        Anime anime = new Anime();
        anime.init("Akudama drive", "TV", 12);
        anime.init("Akudama drive", "TV", "Ação", 12);
        anime.imprime();
    }
}
