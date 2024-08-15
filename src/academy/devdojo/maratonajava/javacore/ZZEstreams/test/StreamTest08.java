package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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
        lightNovels.stream()
                .map(ln -> ln.getPrice())
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(s -> System.out.println(s));

        double sum = lightNovels.stream()
                .mapToDouble(ln -> ln.getPrice())//mapToDouble vc diz ao java para nao retornar um Stream<Double>
                //assim vc evita que ele fique fazendo wrapp e tal com os valores

                .filter(price -> price > 3)
                .sum();
    }
}
