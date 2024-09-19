package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario *= 1.2;
    }

    @Override
    public String toString() {
        return "cargo: gerente\nnome: " + this.nome + "\nsalario: " + this.salario + "\n";
    }
}
