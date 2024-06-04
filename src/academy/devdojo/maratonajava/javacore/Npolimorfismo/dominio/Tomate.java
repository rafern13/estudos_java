package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        System.out.println("Calculando o imposto sobre o tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String getDataValidade(){
        return dataValidade;
    }
}
