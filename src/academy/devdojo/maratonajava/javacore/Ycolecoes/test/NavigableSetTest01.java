package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;
import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

        /*
        se eu tiver um elemento duplicado, digamos que outro manga(10L, Aaragon, 10.99, 0)
        por mais que seja um objeto diferente, ele sera ignorado no TreeSet pois o primeiro elemento ainda tem o mesmo nome de
        outro elemento dentro do Set, uma vez que o compareTo da classe Manga filtra elementos de uma collection tendo nome como parametro
        ALSO, como o parametro de comparação entre dois objetos é usando o compareTo, o TreeSet 'quebra' o contrato do Set, uma vez que
        o Set usa o equals do object para fazer comparações
        Exemplo:
            se eu criar outro Aaragon com mesmo nome porem id diferente, segundo o equals, eles nao seriam iguais, mas seriam iguais segundo o
            compareTo, portanto, nao seria adicionado no TreeSet
            Agora, se dois mangas tiverem o mesmo id e Nome diferentes, como (12L, Aaragon,...) e (12L, Aaragon 2,...), o TreeSet vai colocar eles
            na lista como dois objetos diferentes

         */

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());//TreeSet sempre faz a ordenação usando o compareTo sobrescrito da interface Comparable da classe original
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));



        for (Manga manga : mangas) {//mangas.descendingSet() retorna a lista invertida
            System.out.println(manga);

        }

        Manga yuyu = new Manga(21L, "Yu yu Hakusho", 3.2, 5);
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("----------------");
        System.out.println("lower: "+mangas.lower(yuyu));//retorna dbz pois esse é o imediatamente menor em questão de preço (comparator setado em preço)
        System.out.println("floor: "+mangas.floor(yuyu));//retorna pokemon pois essse é menor ou igual
        System.out.println("higher: "+mangas.higher(yuyu));//retorna berserk pois esse é o imediatamente maior
        System.out.println("ceiling: "+mangas.ceiling(yuyu));//retorna pokemon pois esse é o maior ou igual

        System.out.println("-----------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        /*
        mangas.pollFirst retorna o primeiro elemento da lista e o remove, se ela estiver vazia, retorna null
        mangas.pollLast retorna o ultimo elemento da lista e o remove, e retorna null se ela estiver vazia
         */
        System.out.println(mangas.size());

    }
}
