package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeTest02 {
    public static void main(String[] args) throws IOException {

        /*
        essas classes sao muito específicas
        todas que tiverem 'view' no final servirão para que voce possa mudar algumas características dos objetos
        como, por exemplo, o BasicFileAttributeView, que tem todos para voce alterar o last modified, last access e
        creation time
         */

        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creation time: "+creationTime);
        System.out.println("last modified time: "+lastModifiedTime);
        System.out.println("last access time: "+lastAccessTime);
    }
}
