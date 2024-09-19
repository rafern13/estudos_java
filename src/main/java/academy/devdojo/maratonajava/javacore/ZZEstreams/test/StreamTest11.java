package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

//Summarize
public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("OverLord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Full Metal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(ln -> ln.getPrice())).ifPresent(System.out::println);


    // abaixo, 3 jeitos de fazer a mesma coisa
//        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(ln -> ln.getPrice()))).ifPresent(s -> System.out.println(s));
//        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);


        lightNovels.stream().mapToDouble(ln -> ln.getPrice()).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(ln -> ln.getPrice())));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        //retorna um objeto com tudo que é relevante como atributos. Mt inteligente
        System.out.println(collect);


        String collect1 = lightNovels.stream().map(ln -> ln.getTitle()).collect(Collectors.joining(", "));//util pra krl mané
        System.out.println(collect1);



    }
}
