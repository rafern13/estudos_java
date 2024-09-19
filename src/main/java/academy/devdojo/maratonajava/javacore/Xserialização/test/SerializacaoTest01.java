package academy.devdojo.maratonajava.javacore.Xserialização.test;

import academy.devdojo.maratonajava.javacore.Xserialização.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialização.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "William Suane", "1234123412");
        Turma turma  = new Turma("Maratona Java virado no jiraya em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void desserializar() { //durante a deserialização o construtor nao é chamado. Herança fica paiado de usar
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
