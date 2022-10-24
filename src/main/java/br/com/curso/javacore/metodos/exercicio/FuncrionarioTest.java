package br.com.curso.javacore.metodos.exercicio;

public class FuncrionarioTest {
   
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fernando");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{800, 1.600, 2.500});

        funcionario.imprime();
    }
}
