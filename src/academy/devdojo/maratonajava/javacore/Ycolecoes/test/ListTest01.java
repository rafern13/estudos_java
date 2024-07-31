package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); //era feito assim ate a versao 1.4 do java
//        nomes.add("William");
//        nomes.add("DevDojo Academy");
//        nomes.add(121);
//
//        for (Object  nome: nomes) {
//            System.out.println(nome);
//        }

        //depois, na 1.5, adicionaram o generics (sintaxe diamante ali)
        // e forçaram a determinação do tipo na variável de referência da lista em tempo de compilação, para que nao hajam erros
        // also, arraylists sao dinamicos, logo eles ajustam seu tamanho conforme o necessario, sendo o valor inicial padrao 16 espaços de vetor
        List<String> nomes = new ArrayList(16);//parametro dentro de ArrayList é o tamanho inicial, o metodo é sobrecarregado

        //o ideal em geral é usar no lado esquerdo da declaração do array, usar um tipo de referencia mais generico
        //nesse caso, o List que é uma interface. (Nao é muito comum ja tipar como ArrayList mesmo que voce va usar um arrayList)

        nomes.add("William");
        nomes.add("DevDojo Academy");

        //arrayList é do tipo ORDENADO

        for (String  nome: nomes) {
            System.out.println(nome);
        }

        nomes.add("Suane ");
        System.out.println("--------------");

        //usando for indexado...
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }



    }
}
