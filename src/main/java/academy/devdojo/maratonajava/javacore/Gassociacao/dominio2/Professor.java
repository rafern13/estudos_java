package academy.devdojo.maratonajava.javacore.Gassociacao.dominio2;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("------------------------------------");
        System.out.println("--- PROFESSOR FICHA ---");
        System.out.println("Professor: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if (seminarios == null) return;
        System.out.print("Seminarios: ");
        for (Seminario seminario: this.seminarios){
            System.out.print(seminario.getTitulo()+", ");
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
