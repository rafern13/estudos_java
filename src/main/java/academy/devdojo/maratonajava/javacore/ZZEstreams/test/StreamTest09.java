package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n %2 ==0).forEach(n -> System.out.print(n + " "));//range closed nesse caso vai de 1 ate 50
        System.out.println();
        IntStream.range(1, 50).filter(n -> n %2 ==0).forEach(n -> System.out.print(n + " "));//range so vai de 1 ate 49, ele exclui o ultimo
        System.out.println();

        Stream.of("Eleve ", "O ", "Cosmo ", "No seu coração")
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.print(s));
        System.out.println();


        int[] num = {1,2,3,4,5};
        Arrays.stream(num)//essa linha retorna um IntStream ent vc pode usar metodos encadeados do Integer
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(s -> s.toLowerCase().contains("java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
