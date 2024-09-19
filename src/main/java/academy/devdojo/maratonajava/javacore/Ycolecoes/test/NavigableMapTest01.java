package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
//        Consumidor consumidor1 = new Consumidor("William Suane");
//        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
//        NavigableMap<Consumidor, Consumidor> map = new TreeMap<>(); //nao funcionaria pois a classe consumidor
//        nao implementa comparable e nem TreeMap<>() recebe um comparator como referencia

        //ou seja, o objeto da key precisa ter um meio de comparação pro navigableMap
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        //headMap é linkado ao map q ele chama, logo alterações feitas atrabés dele ficam salvas
        //parece a ideia do Array.asList e tal
        System.out.println(map.headMap("C"));//retorna tudo que ta abaixo do C
        //exemplo: se o map fosse produto e preço, então ele retornaria todos os produtos mais
        //baratos do que o C
        System.out.println(map.headMap("C", true));//quando vc coloca true, ele retorna todos
        //os abaixos de C, inclusive ele. Ou seja, <=.

        //tbm tem uns metodos igual ao treeSet
            //lower <
        System.out.println(map.lowerKey("C"));
            //floor <=
        System.out.println(map.floorKey("C"));
            //higher >
        System.out.println(map.higherKey("C"));
            //ceiling >=
        System.out.println(map.ceilingKey("C"));
    }
}
