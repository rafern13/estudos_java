package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;


//aparentemente o factory é um jeito de desacoplar o codigo
//criei o enum com os paises e usei interface moeda para definir a moeda de cada pais
//depois disso, a classe Currency Factory usa os enums para classificar e retornar em cada um a moeda correnta seguindo o enum
//um uso lindo de interfaces e enums para desacoplamento, lindo mesmo
public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
