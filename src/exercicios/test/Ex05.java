package exercicios.test;

import exercicios.Dominio.LeTresValoresEx05;
import exercicios.Dominio.OrdenaArray;

public class Ex05 {
    //Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        LeTresValoresEx05 leTresValores = new LeTresValoresEx05();
        OrdenaArray ordenaArray = new OrdenaArray();
        int[] valoresOrdenados;

        int[] valores = leTresValores.lerValores();
        valoresOrdenados = ordenaArray.organizaArray(valores);
        for (int i = valores.length - 1; i > -1 ; i--) {
            System.out.print(valoresOrdenados[i]+" ");
        }

    }
}
