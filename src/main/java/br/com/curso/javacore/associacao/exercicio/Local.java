package br.com.curso.javacore.associacao.exercicio;

import lombok.Data;

@Data
public class Local {
    
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

}
