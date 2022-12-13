package br.com.curso.javacore.associacao.dominio;

import lombok.Data;

@Data
public class Professor {
    
    private String nome;
    private Escola escola;

}
