package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermition(){
        System.out.println("Fazendo checagem de permissoes");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieve max data size na interface");
    }
}
