package exercicios.Dominio;

public class AvaliaNumero {
    public void avaliarNumero(int numero){
        System.out.println((numero % 2 == 0) ? "Numero Par" : "Numero Impar");
        System.out.println((numero < 0) ? "Numero Negativo" : "Numero Positivo");
    }
}
