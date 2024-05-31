package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    public enum TipoPagamento {
        DEBITO(1, "Débito"),
        CREDITO(2, "Crédito");

        public final int VALOR;
        public final String pagamentoRelatorio;

        TipoPagamento(int valor, String pagamentoRelatorio){
            this.VALOR = valor;
            this.pagamentoRelatorio = pagamentoRelatorio;
        }

    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String toString() {
        return "nome: " + this.nome +
                "\ntipo_cliente: " + this.tipoCliente.nomeRelatorio +
                "\ntipo_cliente_int: " + this.tipoCliente.VALOR +
                "\ntipo_pagamento: " + this.tipoPagamento.pagamentoRelatorio +
                "\ntipo_pagamento_int: " + this.tipoPagamento.VALOR +
                "\n";
    }
}
