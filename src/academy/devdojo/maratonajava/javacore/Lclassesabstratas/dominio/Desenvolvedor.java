package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public String toString(){
        return "cargo: desenvolvedor\nnome: "+this.nome+"\nsalario: "+this.salario+"\n";
    }

    @Override
    public void calculaBonus(){
        this.salario *= 1.05;
    }

}
