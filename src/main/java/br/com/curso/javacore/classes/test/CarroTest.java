package br.com.curso.javacore.classes.test;

import br.com.curso.javacore.classes.dominio.Carro;

public class CarroTest {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setNome("Golf");
        carro.setModelo("Sportline");
        carro.setAno(2013);

        System.out.println(String.format("--- Dados do véiculo --- \nNome: %s \nModelo: %s \nAno: %s", 
            carro.getNome(), carro.getModelo(), carro.getAno()));
    }
}
