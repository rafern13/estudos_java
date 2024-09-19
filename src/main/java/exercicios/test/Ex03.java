package exercicios.test;

import exercicios.Dominio.LeDoisValores;

public class Ex03 {
    /*
    Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
     */
    public static void main(String[] args) {
        LeDoisValores leDoisValores = new LeDoisValores();
        int c = leDoisValores.somaValoresIguais();
        System.out.println(c);
    }
}
