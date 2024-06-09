package exercicios.udemy.BANCO.dominio;

public class Banco {
    private String nome;
    private ContaBancaria[] contasRegistradas;

    public Banco(String nome){
        this.nome = nome;
    }

    public Banco(String nome, ContaBancaria[] conta){
        this(nome);
        this.contasRegistradas = conta;
    }

    public void imprimeDados(){
        System.out.println("-------- "+this.nome+" --------\n");
        System.out.println("CONTAS REGISTRADAS-\n");
        for(ContaBancaria pessoa: contasRegistradas){
            System.out.println("Nome: "+pessoa.getNome());
            System.out.println("Numero da conta: "+pessoa.getNumeroConta());
            System.out.println("Saldo: "+pessoa.getSaldo());
            System.out.println("--------------------------");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
