package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.test.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        /*
        o lance é sobrescrever o método equals() que a classe Smartphone herda e, mantendo a integridade seguindo as regrinhas que coloquei la,
        fazer com que ele cheque se o serialNumber dos objetos é igual, em vez do normal que seria checar se sao os mesmos objetos.
         */
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
