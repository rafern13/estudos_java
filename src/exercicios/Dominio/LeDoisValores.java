package exercicios.Dominio;

import java.util.Scanner;

public class LeDoisValores {
    Scanner entrada = new Scanner(System.in);

    public int somaValoresIguais(){
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        if (valor1 == valor2){
            return valor1 + valor2;
        }else{
            return valor1 * valor2;
        }
    }
}
