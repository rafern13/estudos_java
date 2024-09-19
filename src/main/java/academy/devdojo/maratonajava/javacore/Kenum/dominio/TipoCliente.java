package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    public final String nomeRelatorio;

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente: values()){
            if (tipoCliente.nomeRelatorio.equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR =  valor;
        this.nomeRelatorio = nomeRelatorio;
    }

}
