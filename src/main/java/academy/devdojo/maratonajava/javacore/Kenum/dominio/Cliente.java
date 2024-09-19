package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
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
                "\ntipo_pagamento: " + this.tipoPagamento +
                "\n";
    }

}
