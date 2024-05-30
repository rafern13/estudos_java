package exercicios;

public class MediaTresNumeros {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 78};
        double media = 0;
        for (int num : numeros){
            media += num;
        }
        System.out.println("A media é "+media/3);
    }
}
