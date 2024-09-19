package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    //Map<K, V> para key e value recebidos, alem disso, ele trabalha usando hash e equals logicamente
    //nao pode ter chave duplicada pois as chaves ficam dentro de um Set que nao aceita duplicações
    public static void main(String[] args) {
        //se eu usar LinkedHashMap, ele mantem a ordem de colocação
        //se não, usa so o HashMap e seja feliz
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        //map.put("vc", "voce2");//quando voce usa a mesma key, ele sobrescreve o valor (coisa do Set) usando .put()
        map.putIfAbsent("vc2", "voce2");//so adiciona se nao houver ocorrencias da chave, ai nao sobrescreve indesejadamente
        System.out.println(map);

        //map.keySet() retorna um set<String> e map.values() retorna um Collection<String>
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("-------------");

        //esse for me permite ter acesso aos dois atributos ao mesmo tempo (chave e valor) usando Entry
        //que é um metodo estatico de Map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }




    }
}
