package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        //LocalDateTime é a junção de LocalTime e LocalDate
        //é para qnd voce precisa trabalhar com os dois
        //vc pode integrar uma 'instancia' de LocalTime ou LocalDate numa LocalDateTime a qualquer momento
        //parece super util de usar
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
