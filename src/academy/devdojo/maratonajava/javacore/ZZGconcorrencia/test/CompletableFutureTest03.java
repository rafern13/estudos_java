package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            //thread daemon meio que é uma thread que nao da lock e nao impede o programa de encerrar quando a operação acabou
            //ela geralmente é usada para garbage collect e coisas assim
            return thread;
        });
        List<String> stores = List.of("Store1", "Store2","Store3","Store4");
        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executor))
                //quando eu passo o executor por aqui, ele nao usa o do forkjoinpoll do supplyAsync, acabando por preferir esse aq usando 10threads
                .collect(Collectors.toList());

        /*
        aqui eu to passando o completable future via stream, no caso do meu service nao ter a opção de fazer as coisas assincronicamente
         */

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesSync %dms%n", end-start);
    }
}
