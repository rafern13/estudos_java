package exercicios.test;

import exercicios.Dominio.AvaliaNumero;
import java.util.Scanner;

public class Ex02 {
    //Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AvaliaNumero avaliador = new AvaliaNumero();
        int numero = entrada.nextInt();
        avaliador.avaliarNumero(numero);
    }
}
