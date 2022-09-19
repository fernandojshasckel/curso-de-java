package br.com.curso.introducao;

/**
 * @author Fernando  Hasckel
 * @since 1.0 (17/09/2022)
 */
public class Operadores {

    public static void main(String[] args) {

        // Operadores aritiméticos

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum result is: " + sum);

        int subtraction = num2 - num1;
        System.out.println("The subtraction result is: " + subtraction);

        double division = num1 / (double) num2;
        System.out.println("The division result is: " + division);

        int multiplication = num2 * num1;
        System.out.println("The multiplication result is: " + multiplication);

        // Operadores relacionais

        int rest = 20 % 2;
        System.out.println("The rest result is: " + rest);

        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println("Ten is greater than twenty: " + isTenGreaterThanTwenty);

        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println("Ten is less than twenty: " + isTenLessThanTwenty);

        boolean isTenLessThanOrEqualToTwenty = 10 <= 20;
        System.out.println("Ten is less or equals than twenty: " + isTenLessThanOrEqualToTwenty);

        boolean isTenGreaterThanOrEqualToTwenty = 10 >= 20;
        System.out.println("Ten is greater or equals than twenty: " + isTenGreaterThanOrEqualToTwenty);

        boolean isTenEqualsTwenty = 10 == 20;
        System.out.println("Ten is equals than twenty: " + isTenEqualsTwenty);

        boolean isTenDifferentFromTwenty = 10 != 20;
        System.out.println("Ten is different than twenty: : " + isTenDifferentFromTwenty);

        // Operadores lógicos

        int age = 35;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary > 4612;
        System.out.println("The individual is within the law being over thirty years of age: " + isWithinTheLawGreaterThanThirty);

        boolean isWithinTheLawLessThanThirty = age < 30 && salary > 3381;
        System.out.println("The individual is within the law being under thirty years of age: " + isWithinTheLawLessThanThirty);

        double currentAccountTotalAmount = 200;
        double totalAmountSavingsAccount = 10000;
        float valuePlayStation = 5000;
        boolean isICanBuy = currentAccountTotalAmount > valuePlayStation || totalAmountSavingsAccount > valuePlayStation;
        System.out.println("Can I buy the PlayStation: " + isICanBuy);
    }
}
