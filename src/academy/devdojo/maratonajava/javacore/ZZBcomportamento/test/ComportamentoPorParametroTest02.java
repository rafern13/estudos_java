package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        /*
        ta legal, essa ideia é muito foda! Ela funciona assim:

        voce precisa filtrar um objeto por algum parametro que pode variar, entao em vez de criar varias classes
        filtro diferentes, voce faz o seguinte:
        1- cria uma interface ObjectPredicate que vai ter um método chamado test() retornando booleano e que
         vai receber um Object o;
            como toda interface é publica e abstrata, sempre que implementada vc vai precisar sobrescrever o
            método test();
        2 - agora, coloca o ObjectPredicate como segundo parametro da função de filtro.
            é tipo passar comparators como parametro, provavelmente essas funçoes de filtro
            sempre vao sobrecarregadas kk
        3 - agora, como voce ta passando um List<> ou qlqr outra collection de objetos para filtrar,
        dentro da iteração sobre o vetor, chama o metodo test() da variável local de ObjectPredicate sobre o
        Object o que foi passado como primeiro parametro da função;
            isso vai funcionar muito interessantemente.
        4 - agora, sempre que voce chamar a função filter, ao passar um novo ObjectPredicate, passando classes
        anonimas, voce sera obrigado a sobrescrever a função test do predicate e ali vc pode mandar ela retornar
        uma declaração. Ex: return object.getNome().equals("*****");
        isso naturalmente vai retornar verdadeiro ou falso

        5 - vc tbm pode usar programação funcional e trocar todo esse trambolho de predicate por lambda kkkkj

        GENIAL, SIMPLESMENTE



         */
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}
