package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        //binary search vai procurar algo na lista, e se nao achar, vai falar o ponto de inserção apropriado
        //(-(ponto de inserção) -1) --> essa é a garantia de que so retorna valor positivo se e somante se o valor da key estiver passado na lista
        //index 0 , 1 , 2 , 3
        //value 0   2   3   4

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 1));



    }
}
