package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;



public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("store1"));
        System.out.println(storeService.getPriceSync("store2"));
        System.out.println(storeService.getPriceSync("store3"));
        System.out.println(storeService.getPriceSync("store4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesSync %dms%n", end-start);
    }
    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("store1");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("store2");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("store3");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("store4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesSync %dms%n", end-start);
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("store1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("store2");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("store3");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("store4");
        System.out.println(pricesAsyncFuture1.join());//o join nao lança exceções do tipo checked, entao voce nao precisa de trycatch hehe
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesSync %dms%n", end-start);
    }
}
