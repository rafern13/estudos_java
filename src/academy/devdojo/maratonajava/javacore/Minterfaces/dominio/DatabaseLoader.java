package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermition() {
        System.out.println("Checando permissoes no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve max data size da classe DatabaseLoader");
    }
}
