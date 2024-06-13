package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings sao imutáveis!!!
        String nome = "William"; // String constant pool
        String nome2 = "William"; // String constant pool
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome);
        System.out.println(nome == nome2);

        // criei uma variável de referência, um objeto e uma string no pool string
        String nome3 = new String("William");
        System.out.println(nome2 == nome3.intern());

    }
}
