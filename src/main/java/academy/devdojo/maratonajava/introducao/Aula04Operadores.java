package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // = - * /
        // pra ter um resultado com decimal voce deve ter uma das variaveis como float ou double
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero1+numero2);
        System.out.println(numero1-numero2);
        System.out.println(numero1*numero2);
        System.out.println(numero1/(double)numero2);

        //todo + usado num print dps de uma string vai servir pra concatenar. se ele tiver sozinho ou antes dela, vai servir para somar. Ex:
        System.out.println(numero1+numero2+" É o resultado da soma entre os numeros: "+numero1+numero2);

    }
}
