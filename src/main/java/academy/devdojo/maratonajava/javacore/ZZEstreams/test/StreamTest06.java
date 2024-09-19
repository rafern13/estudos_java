package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 9));
       //retorna true ou false se existe algum lightnovel mais caro que 8 reais

        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0));
      //retorna true ou false se todas as novels tem preço maior que 0

        System.out.println(lightNovels.stream().noneMatch(l -> l.getPrice() < 0));
        //retorna basicamente o contrario do que o allmatch
        //ele pergunta se nenhum elemento é menor que 0 nessa lista, o que é verdade

        lightNovels.stream()
                .filter(l -> l.getPrice() > 3)
                .findAny()//find any retorna a porra de um optional pq é meio imprevisível
                .ifPresent(ln -> System.out.println(ln));

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(ln -> ln.getPrice()))
                .findFirst()//retorna um optional pra galera
                .ifPresent(ln -> System.out.println(ln));

    }
}
