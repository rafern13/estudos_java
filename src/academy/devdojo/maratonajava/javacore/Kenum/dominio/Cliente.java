package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String toString(){
        return "Nome: "+this.nome+"\nTipo: "+tipoCliente+"\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipoCliente(){
        return tipoCliente;
    }

}
