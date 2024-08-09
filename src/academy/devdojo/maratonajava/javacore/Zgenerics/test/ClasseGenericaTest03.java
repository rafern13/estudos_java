    package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.Service.RentalService;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

    public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando Carro por 1 mes...");
        rentalService.retornarObjetoAlugado(carro);
        RentalService<Barco> rentalService1 = new RentalService<>(barcosDisponiveis);

        Barco Barco = rentalService1.buscarObjetoDisponivel();
        System.out.println("Usando Barco por 1 mes...");
        rentalService1.retornarObjetoAlugado(Barco);

    }
}
