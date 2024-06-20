package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que NAO for digito
        // \s = todos os espaços em branco \t \n  \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = tudo de A-Z, todos os digitos e, underscore _
        // \W = tudo o que nao for incluso no \w
        // [] = procura individualmente cada caractere que eu colocar dentro
//        String regex = "[a-zA-C]";
        String regex = "0[xX][\\da-fA-F]";
//        String texto = "abaaba";
        String texto2 = "12 0X 0x 0XFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
