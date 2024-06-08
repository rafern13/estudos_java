package exercicios.Dominio;

import java.util.Scanner;

public class LeTresValoresEx05 {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[3];

    public int[] lerValores(){
        int auxiliar;
        for (int i = 0; i < 3; i++) {
            auxiliar = entrada.nextInt();
            numeros[i] = auxiliar;
        }
        return numeros;
    }
}
