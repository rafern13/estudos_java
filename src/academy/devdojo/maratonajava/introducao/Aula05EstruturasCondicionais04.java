package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual;
        salarioAnual = 80000;
        if (0 <= salarioAnual && salarioAnual <= 34712){
            System.out.println("O imposto anual que voce terá de pagar é: "+salarioAnual*0.097);
        }else if (34712 < salarioAnual && salarioAnual <= 68507) {
            System.out.println("O imposto anual que voce terá de pagar é: "+salarioAnual*0.3735);
        }else{
            System.out.println("O imposto anual que você terá de pagar é: "+salarioAnual*0.4950);
        }
    }
}
