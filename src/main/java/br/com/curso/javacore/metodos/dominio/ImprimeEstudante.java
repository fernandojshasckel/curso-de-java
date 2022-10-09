package br.com.curso.javacore.metodos.dominio;

public class ImprimeEstudante {
    
    public void imprime(Estudante estudante){

        System.out.println(String.format("--- Informações do estudante --- \nNome: %s \nIdade: %s \nSexo: %s",
            estudante.getNome(), estudante.getIdade(), estudante.getSexo()));
    }
}
