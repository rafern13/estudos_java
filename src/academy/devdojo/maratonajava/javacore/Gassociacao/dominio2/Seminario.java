package academy.devdojo.maratonajava.javacore.Gassociacao.dominio2;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("\n----------------------------");
        System.out.println("--- SEMINARIOS FICHA ---");
        System.out.println("Seminario: "+this.titulo);
        System.out.println("Local: "+this.local.getEndereco());
        if (alunos == null) return;
        System.out.print("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.print(aluno.getNome() + " ");
        }
        System.out.println();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
