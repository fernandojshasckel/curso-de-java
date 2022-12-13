package br.com.curso.javacore.associacao.test;

import br.com.curso.javacore.associacao.dominio.Jogador;
import br.com.curso.javacore.associacao.dominio.Time;

public class JogadorTimeTest {

    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("CBF");

        jogador1.setTime(time);
        jogador1.imprime();
    }

}
