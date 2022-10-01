package br.com.curso.introducao.exercicios;

public class ExercicioEstruturaRepeticaoFor {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 1000000; i++){

            double restoDivisao = i % 2;
            
            if (restoDivisao == 0){
                
                System.out.println("Numero par: " + i);
            }
        }               
    }
}
