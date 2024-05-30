package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString(){
        return "Comprador; "+this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
