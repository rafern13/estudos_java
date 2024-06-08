package exercicios.test;

public class MenorNumero {
    public static void main(String[] args) {
        int[] numeros = {32, 45, 78, 16, 43, 751};
        int menor = 1000000000;
        for (int num : numeros){
            if (num<menor){
                menor = num;
            }
        }
        System.out.println("O menor numero é: "+menor);
    }
}
