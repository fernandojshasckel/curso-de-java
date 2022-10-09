package br.com.curso.javacore.metodos.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudante {
    
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("--- Informações do estudante ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}
