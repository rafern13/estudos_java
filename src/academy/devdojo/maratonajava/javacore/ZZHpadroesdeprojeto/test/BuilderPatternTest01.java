package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .userName("viradonojiraiya")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(person1);
    }
}
