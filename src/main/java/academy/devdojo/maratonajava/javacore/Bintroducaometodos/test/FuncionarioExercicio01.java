package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Daniel");
        funcionario01.setIdade(22);
        funcionario01.setSalarios(1300, 1800, 2300);

        funcionario01.imprime();
        funcionario01.imprimeMediaSalarios();

        Funcionario funcionario02 = new Funcionario();
        funcionario02.setNome("Rafael");
        funcionario02.setIdade(20);
        funcionario02.setSalarios(1200, 1700, 2195);

        funcionario02.imprime();
        funcionario02.imprimeMediaSalarios();
    }
}
