package br.com.curso.introducao;

public class Arrays {
    
    public static void main(String[] args) {
        
        String [] nomes = new String[3];
        nomes[0] = "Fernando";
        nomes[1] = "Julio";
        nomes[2] = "Gaspar";

        for (int i = 0; i <= nomes.length; i++) {
            System.out.println(String.format("O nome na %sº posicao é: %s", i, nomes[i]));
        }
    }
}
