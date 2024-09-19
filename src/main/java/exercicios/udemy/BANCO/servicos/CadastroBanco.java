package exercicios.udemy.BANCO.servicos;

import exercicios.udemy.BANCO.dominio.Banco;
import exercicios.udemy.BANCO.dominio.ContaBancaria;
import java.util.Scanner;

public class CadastroBanco {
    private final Scanner entrada = new Scanner(System.in);
    private Banco banco;
    private ContaBancaria conta;

    public CadastroBanco(){

    }

    public CadastroBanco(ContaBancaria conta){
        this.conta = conta;
    }

    public CadastroBanco(ContaBancaria conta, Banco banco){
        this(conta);
        this.banco = banco;
    }


    public void imprimeDados(){
        if (banco == null){
            System.out.println("Nenhum banco cadastrado");
            System.out.println(conta);
        }else{
            System.out.println(" - - - - - "+banco.getNome()+" - - - - -");
            System.out.println(conta);
        }
    }

    public void cadastrarContaBancariaPessoal(){
        System.out.println("CADASTRANDO NOVA PESSOA.");
        System.out.print("Nome: ");
        String nomePessoa = entrada.nextLine();
        System.out.print("Numero conta: ");
        int numeroConta = entrada.nextInt();
        System.out.print("Deseja fazer deposito inicial?\n1 - SIM\n0 - NÃO\n");
        int checagem = entrada.nextInt();

        entrada.nextLine();//limpando buffer

        if (checagem == 1){
            System.out.print("Deposito inicial: ");
            double depositoInicial = entrada.nextDouble();

            entrada.nextLine();//limpando buffer

            this.conta = new ContaBancaria(nomePessoa, numeroConta, depositoInicial);
            System.out.println();

        }else{

            this.conta = new ContaBancaria(nomePessoa, numeroConta);
            System.out.println();

        }
    }
    public void cadastrarBanco(){
        System.out.print("\nCADASTRANDO NOVO BANCO.\nNome do banco: ");
        String nomeBanco1 = entrada.nextLine();
        this.banco = new Banco(nomeBanco1);
    }

    public void sacarDaConta(double valor){
        this.conta.sacarDaConta(valor);
    }

    public void depositarNaConta(double valor){
        this.conta.depositarNaConta(valor);
    }
}
