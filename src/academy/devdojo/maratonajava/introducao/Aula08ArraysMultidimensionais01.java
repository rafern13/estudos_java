package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    //basicamente to printando uma matriz
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 45;
        dias[0][2] = 23;
        dias[1][0] = 31;
        dias[1][1] = 45;
        dias[1][2] = 75;
        dias[2][0] = 31;
        dias[2][1] = 13;
        dias[2][2] = 5;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        for (int[]linha : dias){
            for (int numero : linha) {
                System.out.println(numero);
            }
        }

    }
}
