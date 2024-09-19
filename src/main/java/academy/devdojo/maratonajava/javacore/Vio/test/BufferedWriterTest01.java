package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        //a buffered writer encapsula a file writer, ela usa buffer de memoria para deixar o desempenho melhor.
        // é util quando voce vai mexer com arquivos grandes
        //ela nao lida muito bem com \n no meio da string, portanto pode ser util usar o metodo newLine(), que pega direto do sistema operacional
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O DevDojo é lindo. É o melhor curso do Brasiiilll.");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
