package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo que NAO for digito
        // \s = todos os espaços em branco \t \n  \f \r
        // \S = Todos os caracteres excluindo os em branco
        // \w = tudo de A-Z, todos os digitos e, underscore _
        // \W = tudo o que nao for incluso no \w
        // [] = procura individualmente cada caractere que eu colocar dentro
        // ? Zero, ou uma ocorrência
        // * zero, ou, mais ocorrências
        // + uma ou mais ocorrências
        // {n, m} um intervalo de n até m ocorrências
        // () agrupamento
        // | é usado mais ou menos assim  o(v|c)o --> isso vai dar match tanto em 'ovo' quanto em 'oco'
        // $ fim da linha
        // . = se meu regex for 1.3, ele poderá retornar --> 123, 133, 1@3, 1A3... é um caracter coringa
        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String texto = "12 0X 0x 0XFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
