package br.com.curso.javacore.associacao.test;

import br.com.curso.javacore.associacao.dominio.Jogador;
import br.com.curso.javacore.associacao.dominio.Time;

public class JogadorTimeBidirecional {
    
    public static void main(String[] args) {
         
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("CBF");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- JOGADOR ---");
        jogador.imprime();

        System.out.println("--- TIME ---");
        time.imprime();
    }

}
