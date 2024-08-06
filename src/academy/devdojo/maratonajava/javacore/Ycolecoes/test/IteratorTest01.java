package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
//        List<Manga> mangas = new ArrayList<>();
        List<Manga> mangas = new LinkedList<>();//mesmo resultado, porem a complexidade pra remove usando iterator é O(1) kkj, mais rapido que o O(n) do arrayList
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        //Iterator<Manga> mangaIterator = mangas.iterator();
        /*
        seguinte, o iterator funciona como se ele olhasse o array inteiro
        e depois operasse, no caso abaixo, ele olha tudo e dps apaga quem tem quantidade = 0
         */
//        while(mangaIterator.hasNext()) {//hasNext() retorna booleano e so para o loop qnd acabar o List
//            if(mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        //primeira função lamba a gente nunca esquece
        //'manga' ta servindo como variavel local
        //mangas.remove, 'se manga, entao manga.quantidades() == 0' é a condição pra remover
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        //por baixo dos panos, usa o mesmo iterator, mas é bem legivel pra nos
        //adoro programação funcional :)
        System.out.println(mangas);

    }
}
