package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //imprima os primeiros 25 valores de um dado numero. Ex: 50
        int meta = 26;
        int contador = 0;
        while (contador < meta){
            if (contador == 25){
                break;
            }
            System.out.println(++contador);
        }
    }
}
