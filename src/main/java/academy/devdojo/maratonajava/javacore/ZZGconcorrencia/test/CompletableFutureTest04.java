package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(service);

    }

    private static void searchPricesWithDiscount (StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2","Store3","Store4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesWithDiscountSync %dms%n", end-start);
    }

    private static void searchPricesWithDiscountAsync (StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2","Store3","Store4");
        List<CompletableFuture<String>> completableFutures = stores.stream()
                //getting the price async storeName:price:discountCode
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                //Instanciando a new quote from the stream generated by getPriceSyc
                .map(cf -> cf.thenApply(Quote::newQuote))
                //composing the first completableFuture
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote)))).collect(Collectors.toList());

                /*
                a ideia é usar um completable future para trampar com o storeServiceWithDiscount e outro para trampar com o Quote
                a partir dai, voce fecha essa lista com 2 CompletableFuture<String> e usa o map com join e forEach para printar

                isso reduz o trabalho em umas 4x kkkj
                 */
        completableFutures.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesWithDiscountSync %dms%n", end-start);
    }
}
