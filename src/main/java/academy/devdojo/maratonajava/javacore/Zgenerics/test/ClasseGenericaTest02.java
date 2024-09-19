package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco Barco = BarcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando Barco por 1 mes...");
        BarcoRentavelService.retornarBarcoAlugado(Barco);
    }
}
