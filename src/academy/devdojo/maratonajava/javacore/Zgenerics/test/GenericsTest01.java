package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        /*
        generics foi criado para evitar que pessoas colocassem objetos de tipos diferentes em Lists
        a ideia foi de colocar o lance da sintaxe diamante <> para lançar excessoes em tempo de compilação quando
        voce passasse um objeto de tipo diferente do especificado
         */

        //o conceito é chamado de type erasure, pois ele é apagado após a compilação do codigo
        //ele serve simplesmente para usarmos apenas coisas relativas à classe passada no List<>
        List<String> lista = new ArrayList();
//        esses dois lançariam excessoes pois sao do tipo Long e Consumidor
//        lista.add(123L);
//        lista.add(new Consumidor("Goku"));
        lista.add("Midoriya");
        lista.add("Midoriya");

        for(String o : lista){
            System.out.println(o);
        }

        add(lista, new Consumidor("Midoriya"));

        for(String o : lista){//retorna exceção de Cast pois o tipo Consumidor nao é castable pra String kkkkkkkkkkk
            System.out.println(o);
        }
    }

    //o generics nao vai deixar compilar, ideia muito foda mesmo
    //ai so da para adicionar o nome do consumidor, mas nao o objeto
    private static void add(List<String> lista, Consumidor consumidor){
        lista.add(consumidor.getNome());

    }
}
