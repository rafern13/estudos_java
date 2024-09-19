package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        //O metodo now() da classe Instant retorna o Zulu time, que é um horario constante para qualquer pessoa do mundo
        //Se nao estou enganado, é o horario exato do meridiano de greenwich, que é exatamente o meio do mundo
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
