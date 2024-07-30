package academy.devdojo.maratonajava.javacore.Xserialização.dominio;

import java.io.*;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 3099558298511407018L;
    private Long id;
    private String nome;
    private transient Turma turma;

    //o modificador transiente serve para nao deixar que certo atributo seja serializado.
    //porem, se vc deixar como transiente so depois de serializar, ele nao vai deserializar porem continuara salvo no arquivo
    private transient String password;

    //mesmo sem serializar antes, atributos estaticos sao imprimidos e salvos pois eles pertecem a classe e nao ao objeto
    private static final String NOME_ESCOLA = "DevDojo viradão no Jiraya";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    /*
    para poder serializar um objeto de uma classe que nao implementa o serializable, é necessario deixar o objeto Turma como transiente, e em seguida
    adicionar esses metodos writeObject e readObject escrevendo e lendo todos os atributos da classe em questao
    na mesma ordem em que você escreveu. Bastante manual eu diria
     */

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {

            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {

            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nome Escola='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }


    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
