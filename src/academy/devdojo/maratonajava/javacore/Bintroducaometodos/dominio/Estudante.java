package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public char sexo;
    public int idade;

    public void imprime(){
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);
    }
}
