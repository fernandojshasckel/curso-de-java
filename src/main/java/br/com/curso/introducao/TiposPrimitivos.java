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
        System.out.println("double: " + salaryDouble);

        float salaryFloat = 2500.99F;
        System.out.println("float: " + salaryFloat);

        char caracter = 'A';
        System.out.println("char: " + caracter);

        byte ageByte = 10;
        System.out.println("byte: " + ageByte);

        short ageShort = 10;
        System.out.println("short: " + ageShort);

        long bigNumber = 100000L;
        System.out.println("long:  " + bigNumber);

        boolean falseTrue = true;
        System.out.println("boolean: " + falseTrue);

        // Exemplo de cast
        double cast = (float) 2000.50F;
        System.out.println("cast: " + cast);
    }
}
