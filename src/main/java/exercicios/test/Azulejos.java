package exercicios.test;

public class Azulejos {
    public static void main(String[] args) {
        double hp, lp, ha, la, resultado;

        hp = 8;
        lp = 10;
        ha = 0.4;
        la = 0.8;

        resultado = (hp*lp)/(ha*la);
        System.out.println("Serão necessários "+resultado+" azulejos.");
    }
}
