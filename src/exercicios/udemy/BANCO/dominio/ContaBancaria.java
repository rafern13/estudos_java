package exercicios.udemy.BANCO.dominio;

public class ContaBancaria {
    private static final int TAXA_DE_SAQUE = 5;
    private String nome;
    private double saldo = 0;
    private final int numeroConta;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String nome, int numeroConta, double depositoInicial) {
        this(nome, numeroConta);
        if (depositoInicial > 0) {
            this.saldo = depositoInicial;
        }
    }

    @Override
    public String toString(){
        return "--- DADOS BANCÁRIOS ---\nNome: "+this.nome+
                "\nNº da conta: "+this.numeroConta+
                "\nSaldo: R$"+this.saldo+
                "\n";
    }

    public void depositarNaConta(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }else{
            System.out.println("Nao pode depositar valor negativo");
        }
    }

    public void sacarDaConta(double valor){
       this.saldo -= valor;
       this.saldo -= TAXA_DE_SAQUE;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }


}
