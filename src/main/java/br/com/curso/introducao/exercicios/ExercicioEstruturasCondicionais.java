package br.com.curso.introducao.exercicios;

public class ExercicioEstruturasCondicionais {
    
    /**
     * @param args
     * Exercicio de estruturas condicionais
     */
    public static void main(String[] args) {
        
        /*
            Dado um determinado sálario anual calcular o imposto a ser pago
            Salario entre 0 e 34.712 9,70% de imposto
            Salario entre 34.713 e 68.597 37,35% de imposto
            Salario maior ou igual a 68.508 49,50% de imposto
         */ 

         double salario = 70000;
         double imposto = 0;

         if (salario <= 34.712){
            imposto = (salario * 9.70)/100;
         } else if (salario >= 34.713 && salario <= 68.597){
            imposto = (salario * 37.35)/100;
         } else if (salario >= 68.508){
            imposto = (salario * 49.50)/100;
         }

         System.out.println("O valor a ser pago de imposto é de R$:" + imposto);
    }
}
