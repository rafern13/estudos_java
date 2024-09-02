package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

//storeName:price:discountCode
public class Discount {
    //aq ele ta usando classe interna para fazer a paradinha. Cool xD
    public enum Code {
        NONE(0), SUPER_SAIYAJIN(5), SUPER_SAIYAJIN2(10), SUPER_SAIYAJIN3(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
