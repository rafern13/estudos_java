package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //suponhamos que seja o diretorio onde estou
        Path dir = Paths.get("/home/william");

        //e esse é o diretorio a qual eu quero chegar
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.java");

        //essa função vai me retornar "devdojofoda\OlaMundo.java", que é basicamente o caminho que ainda preciso correr
        //para chegar ao diretorio que eu quero
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);


        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 "+absoluto1.relativize(absoluto3)); // 1 devdojofoda\OlaMundo.java
        System.out.println("2 "+absoluto3.relativize(absoluto1)); // 2 ..\..
        System.out.println("3 "+absoluto1.relativize(absoluto2)); // 3 ..\..\ usr\local
        System.out.println("4 "+relativo1.relativize(relativo2)); // 4 temp.2021921

        //esse aq da merda pq sao dois tipos diferentes de caminho e o sistema se perde
        System.out.println("5 "+absoluto1.relativize(relativo1));
    }
}
