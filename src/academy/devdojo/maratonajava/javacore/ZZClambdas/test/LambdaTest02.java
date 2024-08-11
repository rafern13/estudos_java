package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        //functions recebem um tipo T, e retornam um tipo R
        List<String> strings = List.of("Natsu", "Allucard", "Rafael");

        List<String> integers = (map(strings, String::toUpperCase));
        forEach(integers, i -> System.out.println(i));

        //isso acima pode ser escrito assim:
        forEach(map(strings, String::toUpperCase), e -> System.out.println(e));

        //ou assim:
        map(strings, String::toUpperCase).forEach(e -> System.out.println(e));

        //muy brabo, da pra usar o retorno de uma lambda pra fazer outra lambda que serve pra fazer outra coisa depois.
        //da para encadear sinistramente kkkkkkkkkkkkkk, mas se nao separar por variaveis de referencia, é facil de se perder


        /*
        ele ta recebendo uma lista com strings e retornando uma lista de inteiros com o tamanho
        nesse caso, a função do seu parametro precisa retornar exatamente R
         */
//        System.out.println(integers);

        /*
        a versão estendida seria essa daqui abaixo
        no metodo map eu especifiquei iria retornar uma lista de uma classe R, entao eu chamo essa de object e la em map ela vai aplicar a função
        s.length() e retornar um Integer que vai ser salvo numa variavel (R r) e ser adicionado na lista que sera retornada
         */

//        List<Object> integers2 = map(strings, new Function<String, Object>() {
//            @Override
//            public Object apply(String s) {
////                return s.length();//retornaria o tamanho da String, R seria um Integer
////                return s.charAt(0);retornaria o primeiro caractere da String, R seria um Char
////                return s.trim(); //retorna as Strings todas sem espaços antes ou depois
////                return s.trim().equals("Rafael");//retorna false, false, true;
//                return s.toUpperCase();
//            }
//        });

    }

    //metodo vai receber um tipo T e R, vai retornar uma lista de R, e vai receber como parametros um List<T> e o Function<T, R>
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }

    private static <T> void forEach(List<T> list, Consumer<T> t) {
        for (T e : list) {
            t.accept(e);
        }
    }
}
