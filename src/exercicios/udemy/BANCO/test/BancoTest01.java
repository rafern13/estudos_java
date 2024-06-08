package exercicios.udemy.BANCO.test;

import exercicios.udemy.BANCO.dominio.Banco;
import exercicios.udemy.BANCO.dominio.ContaBancaria;

public class BancoTest01 {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("Rafael", 1234, 500);
        ContaBancaria pessoa2 = new ContaBancaria("Nicolas Daniel de Lima Amadeu", 3736, 10000);
        ContaBancaria pessoa3 = new ContaBancaria("Ana", 1324);
        ContaBancaria[] contas = {pessoa1, pessoa3, pessoa2};

        Banco banco1 = new Banco("Sicredi", contas);
        banco1.imprimeDados();

        pessoa3.depositarNaConta(4500);

        banco1.imprimeDados();

    }
}
