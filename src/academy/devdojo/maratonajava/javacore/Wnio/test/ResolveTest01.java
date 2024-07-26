package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/william");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 "+absoluto.resolve(relativo));// ## 1 \home\william\dev

        System.out.println("2 "+absoluto.resolve(file));// ## 2 \home\william\file.txt

        //nao pode adicionar de um relativo para um absoluto meu rei, so de absoluto pra relativo
        System.out.println("3 "+relativo.resolve(absoluto)); // ## 3 \home\william

        System.out.println("4 "+relativo.resolve(file));// ## 4 dev\file.txt

        //novamente, nao pode usar caminho absoluto como parametro da função resolve que da merda
        System.out.println("5 "+file.resolve(absoluto));// ## 5 \home\william

        /*file funciona legal pois o caminho dele é relativo. Se ele fosse absoluto esse ainda funcionaria, mas
        o 2 e o 4 que tem ele como parametros da funcao 'resolve()' param de funcionar corretamente
         */
        System.out.println("6 "+file.resolve(relativo));//6 file.txt\dev


    }
}
