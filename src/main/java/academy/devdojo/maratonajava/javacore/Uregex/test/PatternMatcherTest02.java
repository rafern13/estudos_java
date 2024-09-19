package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que NAO for digito
        // \s = todos os espaços em branco \t \n  \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = tudo de A-Z, todos os digitos e, underscore _
        // \W = tudo o que nao for incluso no \w
        String regex = "\\w";
//        String texto = "abaaba";
        String texto2 = "a@#$%!s4s1d65as59as16a5s_d16a s8d4";
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
