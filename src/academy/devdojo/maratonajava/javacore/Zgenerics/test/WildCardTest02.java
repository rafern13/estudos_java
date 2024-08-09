package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }
    //type erasure - após a compilação o java nao sabe dizer se a lista
    //de cachorros pode ser usada quando pede um Animal
    private static void printConsulta(List<? extends Animal> animals){//aq eu to dizendo que posso receber Animal ou qualquer um que seja filho
    //                                                                 no caso, Cachorro ou Gato
        for (Animal animal : animals) {
            animal.consulta();
        }
        Animal a = new Cachorro();// usando polimorfismo da pra fz isso, mas
        //trampando com List, voce precisa passar exatamente o objeto que vai vir
        //no parametro
    }

    private static void printConsultaAnimal(List<? super Animal> animals){ // aqui eu to dizendo que posso receber Cachorro, ou Animal, ou Object, que sao pai e avo de Cachorro

        /*
        como ele so pega classe Animal ou acima, isso me garante que eu posso adicionar tanto gatos qnt cachorros usando animals.add
        é tipo uma garantia do polimorfismo

        no caso de usar List<? extends Animal> animals), eu nao tenho garantia de que o tipo passado vai ser Cachorro ou Animal
         */
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
