package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            // toda vez que eu executar, ele vai apagar tudo e reescrever o que esta no fw.write()

            //se eu quiser que ele so adicione sem apagar, um append, eu coloco um segundo parametro booleano
            //true na hora de chamar a FileWriter, ex:

            // 'FileWriter fw = new FileWriter(file, true);'
            fw.write("O DevDojo é lindo. É o melhor curso do Brasiiilll.\nContinuando a cantoria na linha de baixo.\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
