package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args){
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        int [][] array2 = {{0, 0}, {1, 2, 3},{1,2,3,4,5,6}};

        for (int[] base: array2){
            for (int num: base){
                System.out.println(num);
            }
            System.out.println("---------------------------");
        }
    }
}
