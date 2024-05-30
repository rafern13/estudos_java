package academy.devdojo.maratonajava.javacore.Gassociacao.dominio2;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("--------------------------");
        System.out.println("--- LOCAL FICHA ---");
        System.out.println("local: "+this.endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
