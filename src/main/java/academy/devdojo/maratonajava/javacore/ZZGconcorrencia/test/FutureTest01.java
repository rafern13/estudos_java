package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 4.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = null;
        try {
            //importante. Como esse timeout aqui pode dar runtime exception, o shutdown nunca é chamado se o metodo get nao tiver
            //usando try catch finaly meu prc, ai a thread sempre vai ficar lockada pelo executor
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: "+dollarResponse);
        executorService.shutdown();

    }

    public static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
