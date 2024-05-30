package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios(){
        return salarios;
    }

    public double getMedia(){
        return media;
    }
    public void setSalarios(double... numeros){
        this.salarios = numeros;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.print("Salários: ");
        if (salarios != null){
            for (double salario: this.salarios) {
                System.out.print(salario + ", ");
            }
        }

    }
    public void imprimeMediaSalarios(){
        if (salarios != null){
            for (double salario: this.salarios){
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("\nMédia do salário: "+media);
    }
}
