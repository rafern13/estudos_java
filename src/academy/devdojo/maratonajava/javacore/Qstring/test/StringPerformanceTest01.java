package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar o concatString: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar o concatStringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para executar o concatStringBuffer: " + (fim - inicio) + "ms");
    }

    //leva um tempo significativo em grandes volumes
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 0123...
        }
    }

    // leva bastante tempo a menos que o concat normal, porem pode adicionar certa complexidade
    //parece o append do pythonkkj
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }

    }

    //o StringBuffer é mais relacionado com as threads do sistema ou algo assim
    //tbm leva bem menos tempo, mas ainda é pouca coisa mais lento que o StringBuilder acima
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb1 = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb1.append(i);
        }
    }
}