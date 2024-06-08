package exercicios.udemy.BANCO.test;

import exercicios.udemy.BANCO.servicos.CadastrarBanco;

public class CadastrandoTest01{
    public static void main(String[] args) {
        CadastrarBanco rafael = new CadastrarBanco();
        CadastrarBanco nicolas = new CadastrarBanco();

        rafael.cadastrarContaBancariaPessoal();
        rafael.cadastrarBanco();
        rafael.imprimeDados();

        nicolas.cadastrarContaBancariaPessoal();
        nicolas.cadastrarBanco();
        nicolas.imprimeDados();

    }
}
