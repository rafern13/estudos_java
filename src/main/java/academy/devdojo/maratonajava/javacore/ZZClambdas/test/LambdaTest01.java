package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

//vamos usar Consumer que é uma interface funcional parecida com Predicate

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("William", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        /*
        nesses casos, o Consumer aceita um argumento que costuma retornar void, então ele pode ser usado para fazer certas ações
        mas nunca retornará algo realmente
         */
        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
            
        }
        
    }

}
