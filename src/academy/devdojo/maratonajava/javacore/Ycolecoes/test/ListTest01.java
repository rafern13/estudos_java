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
        /*

        depois, na 1.5, adicionaram o generics (sintaxe diamante ali)
        e forçaram a determinação do tipo na variável de referência da lista em tempo de compilação, para que nao hajam erros
        also, arraylists sao dinamicos, logo eles ajustam seu tamanho conforme o necessario, sendo o valor inicial padrao 16 espaços de vetor
        so pode criar list usando um objeto dentro doo < >, nao pode ser tipo primitivo (nesse caso vc pode usar os wrappers substituindo os primitivos)
        coleçoes nao aceitam tipos primitivos pois elas trabalham com equals e hashcode
        equals e hashcode são herdados por todas as classes ja que eles sao metodos de Object, que é pai de todas as classes
        e como os tipos primitivos nao sao classes, eles nao têm hashcode e equals, logo nao há como usá-los nas lists
         */

        //o ideal em geral é usar no lado esquerdo da declaração do array usar um tipo de referencia mais generico
        //nesse caso, o List que é uma interface. (Nao é muito comum ja tipar como ArrayList mesmo que voce va usar um arrayList)

        //arrayList é do tipo ORDENADO

        List<String> nomes = new ArrayList(16);//parametro dentro de ArrayList é o tamanho inicial, o metodo é sobrecarregado
        List<String> nomes2  = new ArrayList(16);
        nomes.add("William");
        nomes.add("DevDojo ");
        nomes2.add("Suane");
        nomes2.add("Academy");
//        System.out.println(nomes.remove("william"));//retorna um booleano dizendo se removeu ou nn da lista
        nomes.addAll(nomes2);

        for (String  nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");

        //usando for indexado...
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }



    }
}
