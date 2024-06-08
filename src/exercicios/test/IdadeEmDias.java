package exercicios.test;

public class IdadeEmDias {
    public static void main(String[] args) {
        int idadeAnos = 3;
        byte meses = 2;
        byte dias = 15;
        int diasTotais = (idadeAnos*365)+(meses*30)+dias;
        System.out.println(diasTotais);
    }
}
