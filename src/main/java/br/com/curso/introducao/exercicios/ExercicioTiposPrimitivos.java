package br.com.curso.introducao.exercicios;

/**
 * @author Fernando  Hasckel
 * @since 1.0 (17/09/2022)
 */
public class ExercicioTiposPrimitivos {

    public static void main(String[] args) {

        String name = "Fernando";
        String address = "R. das Oliveiras";
        double salary = 3.200;
        String date = "2022/09/17";
        String relatorio = String.format("Eu %s, morando no endereço %s, confirmo que recebi o salario de %s, na data de %s",
                                                name, address, salary, date);

        System.out.println(relatorio);

    }
}
