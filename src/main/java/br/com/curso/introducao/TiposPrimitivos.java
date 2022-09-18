package br.com.curso.introducao;

/**
 * @author Fernando  Hasckel
 * @since 1.0 (17/09/2022)
 */
public class TiposPrimitivos {

    public static void main(String[] args) {

        int age = 10;
        System.out.println("The age is: " + age);

        double salaryDouble = 2000.50;
        System.out.println("This salary double is: " + salaryDouble);

        float salaryFloat = 2500.99F;
        System.out.println("This salary float is: " + salaryFloat);

        char caracter = 'A';
        System.out.println("This caracter is: " + caracter);

        byte ageByte = 10;
        System.out.println("This abe byte is: " + ageByte);

        short ageShort = 10;
        System.out.println("This age short is: " + ageShort);

        long bigNumber = 100000L;
        System.out.println("This big number is: " + bigNumber);

        boolean falseTrue = true;
        System.out.println("This false true is: " + falseTrue);

        // Example of cast
        double cast = (float) 2000.50F;
    }
}
