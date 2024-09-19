package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.Domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.Repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m-> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(1);
        mangaById.orElseThrow(IllegalArgumentException::new);//o orElse extrai o objeto do wrapper, que é o Optional


        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);
    }
}
