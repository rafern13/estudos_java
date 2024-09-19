package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store1", "Store2","Store3","Store4");
        List<CompletableFuture<Double>> completableFutures = stores.stream().
                map(storeService::getPricesAsyncCompletableFuture).
                collect(Collectors.toList());

        /*
        Aqui, a ideia é o seguinte:
        eu preciso passar todos os componentes da lista de lojas e transformar todos eles de string para CompletableFutures (que permite assync threading)
        e para fazer isso, eu usei o getPricesAsyncCompletableFuture para retornar um novo CompletableFuture usando supplyAsync (que permite o fork e poll e tal)
        depois disso, eu coleto todos eles para uma List<CompletableFuture <Double>> que tem todos os preços ja usando threading
        Entao, depois disso, eu faço uma stream usando o join e coleto para uma lista de prices que printo depois(tbm daria pra usar o consumer do foreach para printar todos os elementos usando method reference
         */

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time past to searchPricesSync %dms%n", end-start);
    }
}
