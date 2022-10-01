package br.com.curso.introducao.exercicios;

public class ExercicioEstruturaRepeticaoBreak {
    
    public static void main(String[] args) {
      
        /*
         * Dado 50 números apresentar apenas os 25 primeiros.
         */

        for (int i = 0; i < 50; i++) {
            
            if (i == 25){
                break;
            } else {
                System.out.println("Número da vez: " + i);
            }
        }
    }
}
