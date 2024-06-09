package exercicios.udemy.BANCO.test;

import exercicios.udemy.BANCO.servicos.CadastroBanco;

public class CadastrandoTest01 {
    public static void main(String[] args) {
        CadastroBanco rafael = new CadastroBanco();
        CadastroBanco nicolas = new CadastroBanco();

        cadastrarUsuario(rafael);
        cadastrarUsuario(nicolas);
        limpaConsole();
        rafael.imprimeDados();
        nicolas.imprimeDados();

        rafael.depositarNaConta(300);
        rafael.sacarDaConta(500);

        rafael.imprimeDados();
        nicolas.imprimeDados();
    }

    public static void cadastrarUsuario(CadastroBanco usuario) {
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
