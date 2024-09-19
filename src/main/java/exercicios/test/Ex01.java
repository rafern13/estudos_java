package exercicios.test;

import exercicios.Dominio.LeitorValorNumerico;

public class Ex01 {
    //Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C
    public static void main(String[] args) {
        LeitorValorNumerico lerValores = new LeitorValorNumerico();

        int a = lerValores.lerNumero("A");
        int b = lerValores.lerNumero("B");
        int c = lerValores.lerNumero("C");

        int soma = a+b;
        System.out.println("A+B = "+soma);
        if (soma < c){
            System.out.println("A soma é menor que "+c);
        } else {
            System.out.println("A soma nao é menor que "+c);

        }
    }
}
