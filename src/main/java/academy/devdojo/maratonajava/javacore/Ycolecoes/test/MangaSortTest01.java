package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
voce implementa essa classe Comparator< > que precisa passar como parametro uma classe que herda comparable
e depois disso, voce sobrescreve o metodo compare e usa o metodo compareTo que os objetos
passados como parametros herdam obrigatoriamente de Comparable< >

isso acaba sendo util pois voce nao precisa quebrar seu codigo mexendo no compareTo da classe Manga caso queira mudar o
parametro de comparação

aqui, criei duas classes que posso usar como argumentos de List.sort() para organizar um array tanto por Id, quanto por preço
 */
class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

class MangaByPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }
        System.out.println("---------------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        System.out.println("---------------------------");
        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        System.out.println("---------------------------");
        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByPriceComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
