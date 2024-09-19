package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);
        System.out.println("-------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------");
        Manga mangaToSearch = new Manga(2L, "Dragon Ball Z", 2.99);

        //quando to fznd uma ordenação customizada, tambem preciso passar o objeto
        //como parametro do binarySearch otherwise he will get lost
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

        //lembre-se que ele não ta usando equals para fz a busca, logo se vc alterar
        //o atributo ID de 'mangaToSearch', ele vai achar que é um objeto diferente e retornar '-6', que
        //é onde voce deveria inserir

    }
}
