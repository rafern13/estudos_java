package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    //essa classe parece que serve para listar todos os diretorios presentes no local de onde voce instanciou o path
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {

            for(Path path: stream) {
                System.out.println(path.getFileName());
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar o bglh "+e.getMessage());
        }
    }
}
