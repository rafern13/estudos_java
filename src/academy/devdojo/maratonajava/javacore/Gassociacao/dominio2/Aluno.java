package academy.devdojo.maratonajava.javacore.Gassociacao.dominio2;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("---------------------------");
        System.out.println("--- ALUNO FICHA ---");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.print("Seminario: ");
        if (seminario == null) return;
        System.out.println(this.seminario.getTitulo());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }
}

