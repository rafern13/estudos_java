package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("Aspire 5", 2800);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("____________________________");
        CalculadoraImposto.calcularImposto(computador);
    }
}
