package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        //setters e getters
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraiya");
        pessoa.setIdade(70);


        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
