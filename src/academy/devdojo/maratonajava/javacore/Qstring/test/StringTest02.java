package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        // metodo charAt() retorna a posição de uma letra no array da String
         String nome = "Luffy";
        System.out.println(nome.charAt(0));

        //o length de um array de inteiros, por exemplo, é um ATRIBUTO
        int[] nums = {1,2,3,4};
        System.out.println(nums.length);

        // O length de uma String é um método
        System.out.println(nome.length());

        //metodo replace troca todos os caracteres de um determinado tipo por outro
        System.out.println(nome.replace("f", "l"));

        // metodos toLowerCase e toUpperCase retornam a String em minusculo e maiusculo, respectivamente
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        // o length da string é 6
        String numeros = "012345";

        // o string.substring(a, b) retorna substring x entre a <= x < b
        //ou seja, ele pega a partir de a e para antes do b, sem incluí-lo
        // tambem da para enxergar como segmento nao inclusivo de uma reta
        //a-------------|b
        System.out.println(numeros.substring(0, 2)); // returns "01"

        String nome2 = "      LUFFY       ";
        //metodo trim() remove os valores em branco do começo e do fim da String
        System.out.println(nome2.trim());
        System.out.println(nome2);


    }
}
