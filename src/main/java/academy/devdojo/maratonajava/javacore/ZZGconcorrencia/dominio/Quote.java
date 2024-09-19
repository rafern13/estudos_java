package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public final class Quote {
    private String storeName;
    private final double price;
    private final Discount.Code discountCode;

    private Quote(String storeName, double price, Discount.Code discountCode) {
        this.storeName = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }

    /**
     * Creates new Quote object from the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1].replace(",",".")), Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "storeName='" + storeName + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
