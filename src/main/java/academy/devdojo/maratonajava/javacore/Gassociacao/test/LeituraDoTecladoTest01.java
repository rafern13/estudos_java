package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite M ou F para o seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("--- Relatório ---" +
                            "\nnome: "+nome+
                            "\nIdade: "+idade+
                            "\nSexo: "+sexo
                            );

    }
}
