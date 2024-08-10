package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;


import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        //List.of sozinho é imutavel, entao da mio no comparator
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        barcoList.sort(new Comparator<Barco>() {//fazer isso aqui é util so quando voce nao vai precisar fazer sort denovo
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        //da pra fazer usando programação funcional tambem
        //barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        System.out.println(barcoList);
    }
}
