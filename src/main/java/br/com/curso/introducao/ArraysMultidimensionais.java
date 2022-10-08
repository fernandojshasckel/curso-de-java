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

        System.out.println("-----------------------------");

        // Outra forma de inicializar os arrays
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        // Exemplo de inicialização passando os valores
        arrayInt[3] = new int[]{1, 2, 3, 4};

        for (int i = 0; i < arrayInt.length; i++) {
            
            for (int j = 0; j < arrayInt[i].length; j++) {
                
                System.out.println(arrayInt[i][j]);
            }
        }
    }
}
