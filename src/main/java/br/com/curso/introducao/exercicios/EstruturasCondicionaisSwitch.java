package br.com.curso.introducao.exercicios;

public class EstruturasCondicionaisSwitch {
    
    public static void main(String[] args) {
        
        /*
         * Dado os valores de 1 a 7, imprima se é dia util ou
         * final de semana, considerando 1 como domingo
         */ 

         byte diaSemana = 1;

         switch (diaSemana){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil \nSegunda-Feira");
                break;
            case 3:
                System.out.println("Dia útil \nTerça-Feira");
                break;
            case 4:
                System.out.println("Dia útil \nQuarta-Feira");
                break;
            case 5:
                System.out.println("Dia útil \nQuinta-Feira");
                break;
            case 6:
                System.out.println("Dia útil \nSexta-Feira");
                break;
            case 7:
                System.out.println("Final de semana \nSábado");
                break;
            default:
                System.out.println("Opção inválida, a semana tem apenas sete dias!");
         }
    }
}
