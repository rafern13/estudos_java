package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado o valor de um carro, descubra em qnts vzs ele pode ser parcelado
    //condição: valor minimo da parcela sao 1000
    public static void main(String[] args) {
        double valorCarro = 27000;
        for (int parcela = 1; parcela < 1000; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela<1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$"+valorParcela);

        }
    }
}

