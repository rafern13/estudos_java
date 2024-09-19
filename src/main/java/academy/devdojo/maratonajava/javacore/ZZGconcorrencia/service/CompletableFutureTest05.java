package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);

    }

    private static void searchPricesWithDiscountAsync (StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2","Store3","Store4");
        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d\n", store, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);


//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        //allof encapsula o funcionamento de todos os completable futures e libera eles qnd todos acabarem
        //anyof encapsula e libera o resultado assim que o primeiro ja funcionar kkkkj
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b.\n", voidCompletableFuture.isDone());
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesWithDiscountSync %dms%n", end-start);
    }
}
