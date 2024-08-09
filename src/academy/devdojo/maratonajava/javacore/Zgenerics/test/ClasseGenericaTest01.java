package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.Service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando Carro por 1 mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
