package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //printe os numeros pares entre 0 e 1000
        int i ;
        for (i = 0; i < 1001; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
