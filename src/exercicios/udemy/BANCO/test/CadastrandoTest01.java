package exercicios.udemy.BANCO.test;

import exercicios.udemy.BANCO.servicos.CadastrarBanco;

public class CadastrandoTest01 {
    public static void main(String[] args) {
        CadastrarBanco rafael = new CadastrarBanco();
        CadastrarBanco nicolas = new CadastrarBanco();

        cadastrarUsuario(rafael);
        cadastrarUsuario(nicolas);
        limpaConsole();
        rafael.imprimeDados();
        nicolas.imprimeDados();

    }

    public static void cadastrarUsuario(CadastrarBanco usuario) {
        usuario.cadastrarContaBancariaPessoal();
        usuario.cadastrarBanco();
        limpaConsole();
    }

    public static void limpaConsole() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

}
