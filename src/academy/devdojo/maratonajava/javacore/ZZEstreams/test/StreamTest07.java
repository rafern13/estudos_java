package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        integers.stream()
                .reduce((x, y) -> x + y)
                .ifPresent(i -> System.out.println(i));//ou .ifPresent(System.out::println)

        System.out.println(integers.stream()
                .reduce(0, (x, y) -> x + y));//quando eu coloco a identidade como zero, no pior caso a soma fica sendo 0 entao nao precisa do Optional

        integers.stream()
                .reduce(Integer::sum)
                .ifPresent(i -> System.out.println(i));//da para facilitar usando method reference dentro do reduce booy, pelo metodo sum de Integer

        System.out.println(integers.stream()
                .reduce(0, Integer::sum));//colocar identidade como 0 aqui tambem evita que ela retorne um optional e precise do ifPresent()

        System.out.println("----------------");

        integers.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);//aq ta retornando a multiplicação das parada

        System.out.println(integers.stream()
                .reduce(1, (x, y) -> x * y));//aq retorna 0 porque no final das contas voce ta multiplicando por 0 qnd identity é 0, coloca 1

        System.out.println("----------------");

        integers.stream()
                .reduce((x, y) -> x > y ? x : y)//operador ternário salvando a patria kakakakak, aqui retorna o maior numero da lista papai
                .ifPresent(System.out::println);

        integers.stream()
                .reduce( Integer::max).ifPresent(s -> System.out.println(s));



    }
}
