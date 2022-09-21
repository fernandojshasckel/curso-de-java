package br.com.curso.introducao;

public class EstruturasCondicionais {
    
    /**
     * @param Estruturas condicionais
     */
    public static void main(String[] args) {
        
        int age = 20;

        if (age >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean isAuthorized = age >= 18;

        if (isAuthorized){
            System.out.println("Autorizado a comprar bebida alcólica");
        }  
        
        if (!isAuthorized){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 18;
        String categoria;

        if (idade < 15){
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else if (idade >= 18){
            categoria = "Categoria adulto";
        }
    }
}
