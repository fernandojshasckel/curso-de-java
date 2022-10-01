package br.com.curso.introducao.exercicios;

public class ExercicioCondicaoComLoop {
    
    /**
     * @param args
     * Exercicio laço de repetição e condição
     */
    public static void main(String[] args) {
        
        /*
         * Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
         * Condição que o valor da parcela seja >= R$ 1000,00
         */

        double valVeiculo = 30000;
        double valParcela = 0;
        for (int parcela = 1; parcela <= valVeiculo; parcela++) {
            
            valParcela = valVeiculo / parcela;
            
            if (valParcela < 1000) {

                break;
            }
            System.out.println(String.format("Parcela %s, R$: %s", parcela, valParcela));
        }
    }
}
