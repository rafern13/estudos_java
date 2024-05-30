package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 200;
        float salarioFLoat = 2500;
        byte idadeByte = 127;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";
        System.out.println("Oi eu sou o "+nome);

        System.out.println("A idade é "+idade+" anos.");
        System.out.println(idadeByte);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println(idadeShort);

    }
}
