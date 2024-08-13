package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        //quero retornar uma lista com cada uma das letras de cada palavra. Ex: ["G", "o",
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        System.out.println("-------------");
        List<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);

        List<String> letters2 = words.stream()
                .map(w -> w.split(""))//Stream<String[]>>
                .flatMap(array -> Arrays.stream(array))//Stream<String>
                .collect(Collectors.toList());//retorna um List<String>
        //aqui usamos o flatmap sempre que tivermos muitas streams aninhadas

        System.out.println(letters2);


    }
}
