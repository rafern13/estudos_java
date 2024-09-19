package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Cuiabá, ' dd 'de' MMMM 'de' yyyy 'às' dd'h'mm'm'ss's'";
        //o formato é customizável. So olhar no site e ver quais sao as letras reservadas para cada informação especifica
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

    }
}
