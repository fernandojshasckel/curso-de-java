package br.com.curso.introducao;

public class ArraysMultidimensionais {
    
    public static void main(String[] args) {
        
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        // Utilizando for para imprimir os valores
        for (int i = 0; i < dias.length; i++) {
            
            for (int j = 0; j < dias[i].length; j++) {
                
                System.out.println(dias[i][j]);
            }
        }

        // Utilizando foreach para imprimir os valores
        for (int[] arrayBase : dias) {
            
            for (int num : arrayBase) {
                
                System.out.println(num);
            }
        }
    }
}
