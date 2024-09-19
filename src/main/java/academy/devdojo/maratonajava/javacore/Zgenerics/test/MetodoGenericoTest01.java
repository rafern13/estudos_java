package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> canoasBrabas = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(canoasBrabas);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {//o <T> vai antes da especificação do retorno da função
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
        return list;
    }
}

/*
so para comentar, isso aqui é completamente possivel hehehe, voce pode passar quantos generics voce quiser na hora de criar uma classe
 */
//class DoisAtributos<T, X, I> {
//    private T t;
//    private X x;
//    private I i;
//
//    public DoisAtributos(T t, X x, I i) {
//        this.t = t;
//        this.x = x;
//        this.i = i;
//    }
//}
