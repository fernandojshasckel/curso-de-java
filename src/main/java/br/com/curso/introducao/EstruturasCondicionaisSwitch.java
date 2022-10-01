package br.com.curso.introducao;

public class EstruturasCondicionaisSwitch {
    
    /**
     * @param args
     * Estruturas condicionais utilizando Switch
     */
    public static void main(String[] args) {
        
        // Imprimir o dia da semana, considerando domingo como o primeiro
        byte dia = 1;

        switch (dia){
            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        // Imprimir o sexo
        char sexo = 'F';

        switch (sexo){
            case 'F':
                System.out.println("Pessoa do sexo feminino");
            case ('M'):
                System.out.println("Pessoa do sexo masculino");
            default:
                System.out.println("Opção inválida para o contexto");
        }
    }
}
