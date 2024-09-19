package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        //Duration é uma classe que trabalha com periodos de tempo
        //ela aceita LocalDateTime e LocalTime, porem nao aceita LocalDate(para esse voce usa a classe Period)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
//        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(d1);
        System.out.println(d2);
    }
}
