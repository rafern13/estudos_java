package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("getting prices sync for store %s\n", storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName) {
        System.out.printf("getting prices sync for store %s\n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("getting prices sync for store %s\n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);//completable future usa internamente o fork join pool que é
        //aquela parada de quebrar o trabalho em pedaços e depois de resolver, juntar os resultados kkj

    }

    private double priceGenerator() {
        System.out.printf("%s generating price\n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;

    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void shutdown() {
        ex.shutdown();
    }
}
