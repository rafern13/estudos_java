package academy.devdojo.maratonajava.javacore.ZZClambdas.test;


import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 720)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic); //bastante facil. Literalmente so criar um objeto e chamar o metodo pela instancia do objeto
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2)); //bastante facil. Literalmente so criar um objeto e chamar o metodo pela instancia do objeto
        System.out.println(animeList);


    }
}
