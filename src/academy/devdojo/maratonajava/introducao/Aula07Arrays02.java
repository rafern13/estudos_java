package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //quando declarar arrays, cada tipo primitivo tem um valor padrão nos arrays
        // int, short, long, double, float e byte == 0
        // char == '\u0000' == ' '
        // boolean == false
        // String == null
        String[] idades = new String[3];
        idades[0] = "Luffy";
        idades[1] = "Zoro";
        idades[2] = "Sanji";
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
