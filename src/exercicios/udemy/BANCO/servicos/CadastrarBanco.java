package exercicios.udemy.BANCO.servicos;

import exercicios.udemy.BANCO.dominio.Banco;
import exercicios.udemy.BANCO.dominio.ContaBancaria;
import java.util.Scanner;

public class CadastrarBanco {
    private Scanner entrada = new Scanner(System.in);
    private Banco banco;
    private ContaBancaria conta;

    public CadastrarBanco(){

    }

    public CadastrarBanco(ContaBancaria conta){
        this.conta = conta;
    }

    public CadastrarBanco(ContaBancaria conta, Banco banco){
        this(conta);
        this.conta = conta;
    }

    public void cadastrarBanco(){
        System.out.println("CADASTRANDO NOVO BANCO.");
        System.out.print("Nome do banco: ");
        String nomeBanco = entrada.nextLine();
        this.banco = new Banco(nomeBanco);
    }

    public void imprimeDados(){
        if (banco == null){
            System.out.println("Nenhum banco cadastrado");
        }else{
            System.out.println(banco);
            System.out.println(conta);
        }
        System.out.println(conta);
    }

    public void cadastrarContaBancariaPessoal(){
        System.out.println("CADASTRANDO NOVA PESSOA.");
        System.out.print("Nome: ");
        String nomePessoa = entrada.nextLine();
        System.out.print("Numero conta: ");
        int numeroConta = entrada.nextInt();
        System.out.print("Deseja fazer deposito inicial?\n1 - SIM\n0 - NÃO\n");
        int checagem = entrada.nextInt();
        if (checagem == 0){
            this.conta = new ContaBancaria(nomePessoa, numeroConta);
            return;
        }else if(checagem == 1){
            System.out.print("Deposito inicial: ");
            double depositoInicial = entrada.nextDouble();
            this.conta = new ContaBancaria(nomePessoa, numeroConta, depositoInicial);
            return;
        }else{
            System.out.println("Digitou valor invalido, o usuario sera cadastrado sem deposito inicial por padrao.");
        }

    }
}
