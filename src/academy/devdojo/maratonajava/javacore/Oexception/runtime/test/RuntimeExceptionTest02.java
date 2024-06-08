package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    /**
     *
     * @param a
     * @param b cannot be 0
     * @return
     * @throws IllegalArgumentException if b is 0
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não se pode dividir por zero");
        }
        return a/b;
    }
}
