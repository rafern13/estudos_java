package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Full Metal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        //ações intermediarias retornam o proprio stream, entao permitem encadeamento e os krl
        //ações finais são as que retornam alguma coisa e encerram o stream
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(l -> l.getTitle()))//ordena o lightNovels por ordem alfabetica usando Comparator
                .filter(ln -> ln.getPrice() <= 4)//filtra e retorna uma stream so com os lightnovels abaixo de 4 reais
                .limit(3)//limita so até 3 lightnovels e retorna uma stream com eles
                .map(ln -> ln.getTitle())//pega os 3 objetos e retorna seus nomes
                .collect(Collectors.toList());//coleta os 3 nomes e guarda numa lista, em seguida a retorna

        System.out.println(titles);

    }
}
