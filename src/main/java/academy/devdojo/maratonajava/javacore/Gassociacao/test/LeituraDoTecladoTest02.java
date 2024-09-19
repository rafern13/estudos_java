package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EU SOU O GRANDE ADIVINHADOR DO BAGULHO");
        System.out.println("DIGITE SUA PERGUNTA PARA O GRANDE ADIVINHADOR (ou baleia para sair):");

        while (true) {
            String pergunta = input.nextLine();
            if (pergunta.equals("baleia")) {
                break;
            }
            if (pergunta.charAt(0) == ' ') {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
        }
    }
}
