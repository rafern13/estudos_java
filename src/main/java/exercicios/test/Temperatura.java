package exercicios.test;

public class Temperatura {
    public static void main(String[] args){
        double temperaturaCelsius = 40;
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        double temperaturaReaumur = temperaturaCelsius * 0.8;
        double temperaturaRankine = temperaturaFahrenheit + 459.67;

        System.out.println("A temperatura em fahrenheit é: "+temperaturaFahrenheit);
        System.out.println("A temperatura em kelvin é: "+temperaturaKelvin);
        System.out.println("A temperatura em reaumur é: "+temperaturaReaumur);
        System.out.println("A temperatura em rankine é: "+temperaturaRankine);

    }
}
