package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    /*
    Pelo o que eu entendi, o Optional foi criado para que se pudessem evitar nullPointerExceptions
    por exemplo, se eu tenho uma variavel que recebe o retorno de uma função, qualquer manipulação que eu faça com ela pode
    dar nullPointer se o retorno dessa função for null
     */
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println("_-----------------_");

        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
