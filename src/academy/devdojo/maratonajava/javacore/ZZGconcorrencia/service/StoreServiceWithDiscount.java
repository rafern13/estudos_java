package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Discount;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }
    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;

    }

    public String applyDiscount (Quote quote) {
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'."
                ,quote.getStoreName()
                , quote.getPrice()
                ,quote.getDiscountCode()
                ,discountValue);
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
