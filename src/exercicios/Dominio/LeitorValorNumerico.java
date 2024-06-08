package exercicios.Dominio;

import java.util.Scanner;

public class LeitorValorNumerico {
    Scanner entrada = new Scanner(System.in);

    public int lerNumero(String nomeVariavel){
        System.out.print(nomeVariavel+": ");
         return entrada.nextInt();
    }
}
