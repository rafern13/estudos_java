package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTImeFormaterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20240619", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-06-19", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-06-19", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2024-06-19T10:54:30.6312654", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formaterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatoBrasil = LocalDate.now().format(formaterBrasil);
        System.out.println(formatoBrasil);

        LocalDate parseBrasil = LocalDate.parse("13/08/2003", formaterBrasil);
        System.out.println(parseBrasil);

        DateTimeFormatter formatterGermany = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGermany);
        System.out.println(formatGR);

        LocalDate parseGR = LocalDate.parse("19.Juni.2024", formatterGermany);
        System.out.println(parseGR);
    }
}
