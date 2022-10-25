package br.com.curso.javacore.metodos.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    
    private String nome;
    private int idade;

    public void imprime() {

        System.out.println(String.format("Nome: %s \nIdade: %s", this.nome, this.idade));
    }
}
