package br.com.curso.introducao;

public class EstruturaDeRepeticao {
    
    public static void main(String[] args) {
        
        int count = 0;

        // while
        while (count < 10) {
            System.out.println("O contador da vez é: " + count);
            count++;
        }

        // do while
        do {
            System.out.println("O contador da vez é: " + count);
            count++;
        } while (count < 10);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("O contador da vez é: " + i);
        }
    }
}
