package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //dados os valores de 1 a 7 como dias, diga se é dia util ou final de semana
        //considere 1 como domingo
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FIM DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA UTIL");
                break;
            default:
                System.out.println("INVALIDO");
                break;
        }
    }
}
