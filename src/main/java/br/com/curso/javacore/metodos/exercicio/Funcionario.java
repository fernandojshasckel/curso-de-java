package br.com.curso.javacore.metodos.exercicio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
    
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){

        System.out.println(String.format("Nome: %s \nIdade: %s", this.nome, this.idade));

        if (salarios == null) {

            return;
        }

        for (int i = 0; i < salarios.length; i++) {
        
           System.out.println(String.format("O %s° sálario é de: %s", i, salarios[i]));
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){

        if (salarios == null) {

            return;
        }

        double media = 0;
            
        for (double salario : salarios) {
        
            media += salario;
        }

        media /= salarios.length;
        System.out.println("A média do sálario é = " + media);
    }
}
