package br.com.curso.introducao;

public class EstruturasCondicionais {
    
    /**
     * @param Estruturas condicionais
     */
    public static void main(String[] args) {
        
        int age = 20;

        if (age >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        } 

        boolean isAuthorized = age >= 18;

        if (isAuthorized){
            System.out.println("Autorizado a comprar bebida alcólica");
        }  
        
        if (!isAuthorized){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
    }
}
