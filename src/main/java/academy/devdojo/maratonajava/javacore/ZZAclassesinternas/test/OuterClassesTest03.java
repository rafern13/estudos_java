package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "William";

    /*
    uma class estatica interna seria topLevel igual a OuterClassesTest03, funciona muito parecido tambem
    mas se essa classe so será usada dentro de OuterClasses3, fica mais facil de criar ela dentro, ate porque
    ela teria acessoa a atributos privados tambem, o que so ocorreria por meio de get e set se ela estivesse fora

    assim como a interface Entry fica dentro da interface Map, é um bom exemplo, pois a forma com que os metodos de
    entry funcionam faz com que seja mais interessante deixá-lo dentro de Map
     */
    static class Nested {//so da para acessar atributos estaticos da classe externa, ou funções

        private String lastName = "Suane";

        void print() {
        //para acessar um atributo nao-estatico por aqui, é necessário fazer o seguinte
            System.out.println(new OuterClassesTest03().name + " " + lastName);

        }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
