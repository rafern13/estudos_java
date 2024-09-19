package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-567");

        Pessoa pessoa = new Pessoa("Luffy");
        pessoa.setCpf("51960750895");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("_------------------------------");

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("16511651981");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.25);
        funcionario.imprime();
        System.out.println("-----------------------");

        Funcionario funcionario3 = new Funcionario("Kakashi");
        funcionario3.setCpf("66666666666");
        funcionario3.setEndereco(endereco);
        funcionario3.setSalario(15645);
        funcionario3.imprime();

        funcionario3.relatorioPagamento();

    }
}
