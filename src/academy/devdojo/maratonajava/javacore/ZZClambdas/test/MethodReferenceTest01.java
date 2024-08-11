package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("HxH", 148), new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 720)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        /*
        aqui, como eu criei uma classe com metodo estatico que encapsula a logica, posso passar esses metodos dentro da função lambda e deixar mais conciso
         */
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        System.out.println(animeList);
        System.out.println("--------------------");
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);//nesse caso n muda pq eles tao ordenados certos por nome e episodios impressionantemente
        System.out.println(animeList);
    }
}
