package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listToArray));
        System.out.println("----------------");
        Integer[] numerosArray = new Integer[3];

        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //Arrays.asList é um metodo que linka o array e a List, mudanças em um refletem no outro
        arrayToList.set(0, 12);
//        arrayToList.add(19); //da unsupported exception qnd vc usa o asList. Problematico demais
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);


        System.out.println("_----------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));//cria um novo espaço na memoria, como nao usam a mesma referencia, um nao fica linkado ao outro
        //vc quebra o vinculo mesmo usando o asList, mesmo ele sendo imutável;
        numerosList.add(15);
        System.out.println(numerosList);

        Arrays.asList("1", "2");
        //List.of();//usa n elementos
    }
}
