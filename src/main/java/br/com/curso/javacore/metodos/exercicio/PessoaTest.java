package br.com.curso.javacore.metodos.exercicio;

import br.com.curso.javacore.metodos.dominio.Pessoa;

public class PessoaTest {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fernando");
        pessoa.setIdade(20);
        pessoa.imprime();
    }
}
