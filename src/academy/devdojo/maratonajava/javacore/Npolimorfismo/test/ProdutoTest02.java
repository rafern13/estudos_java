package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto tomate = new Tomate("Americano", 20);
        Produto computador = new Computador("Aspire 5", 2800);

        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calcularImposto());
        System.out.println("----------------");
        System.out.println(computador.getNome());
        System.out.println(computador.getValor());
        System.out.println(computador.calcularImposto());
    }
}
