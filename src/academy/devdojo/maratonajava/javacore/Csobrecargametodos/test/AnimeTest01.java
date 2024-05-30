package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama drive", "TV", 12);
        anime.init("Akudama drive", "TV", 12, "Ação");
        anime.setGenero("Ação");
        anime.imprime();
    }
}
