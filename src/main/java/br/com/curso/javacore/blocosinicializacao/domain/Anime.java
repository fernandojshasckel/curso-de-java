package br.com.curso.javacore.blocosinicializacao.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime {
    
    private String nome;
    private int[] episodios = new int[100];

    {
        // Bloco de inicialização, criado toda vez que o objeto é instanciado.
        for (int i = 0; i < episodios.length; i++) {
            
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int i = 0; i < episodios.length; i++) {
            
            System.out.println("Episodio: " + episodios[i]);
        }
    }
}
