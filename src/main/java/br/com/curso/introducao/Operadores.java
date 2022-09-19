package br.com.curso.introducao;

/**
 * @author Fernando  Hasckel
 * @since 1.0 (17/09/2022)
 */
public class Operadores {

    /**
     * @param Operadores
     */
    public static void main(String[] args) {

        // Operadores aritiméticos

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Soma: " + sum);

        int subtraction = num2 - num1;
        System.out.println("Subtração: " + subtraction);

        double division = num1 / (double) num2;
        System.out.println("Divisão: " + division);

        int multiplication = num2 * num1;
        System.out.println("Multiplicação: " + multiplication);

        // Operadores relacionais

        int rest = 20 % 2;
        System.out.println("Resto da divisão: " + rest);

        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("Maior: " + isTenGreaterThanTwenty);

        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println("Menor: " + isTenLessThanTwenty);

        boolean isTenLessThanOrEqualToTwenty = 10 <= 20;
        System.out.println("Menor ou igual: " + isTenLessThanOrEqualToTwenty);

        boolean isTenGreaterThanOrEqualToTwenty = 10 >= 20;
        System.out.println("Maior ou igual: " + isTenGreaterThanOrEqualToTwenty);

        boolean isTenEqualsTwenty = 10 == 20;
        System.out.println("Igual: " + isTenEqualsTwenty);

        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println("Diferente: : " + isTenDifferentFromTwenty);

        // Operadores lógicos

        int age = 35;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary > 4612;
        System.out.println("And: " + isWithinTheLawGreaterThanThirty);

        boolean isWithinTheLawLessThanThirty = age < 30 && salary > 3381;
        System.out.println("And: " + isWithinTheLawLessThanThirty);

        double currentAccountTotalAmount = 200;
        double totalAmountSavingsAccount = 10000;
        float valuePlayStation = 5000;
        boolean isICanBuy = currentAccountTotalAmount > valuePlayStation || totalAmountSavingsAccount > valuePlayStation;
        System.out.println("Ou: " + isICanBuy);

        // Operadores de atribuição

        double bonus = 1800;
        bonus += 1000;
        System.out.println("Soma com atribuição: " + bonus);

        double bonus2 = 1800;
        bonus2 -= 1000;
        System.out.println("Subtração com atribuição: " + bonus2);

        double bonus3 = 1800;
        bonus3 *= 2;
        System.out.println("Multiplicação com atribuição: " + bonus3);

        double bonus4 = 3000;
        bonus4 /= 2;
        System.out.println("Divisão com atribuição: " + bonus4);

        double remainderBonus = 3000;
        remainderBonus %= 2;
        System.out.println("Resto da divisão com atribuição: " + remainderBonus);
    }
}
