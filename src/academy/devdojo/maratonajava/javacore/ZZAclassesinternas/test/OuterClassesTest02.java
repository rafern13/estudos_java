package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    //classes locais sao classes criadas dentro de um método, ou até mesmo dentro de um bloco de inicialização
    void print() {
        String lastName = "Izuku";

        //os únicos modificadores possiveis são abstract ou final
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);//para poder usar lastname,
                //o lastName precisa ser final ou efetivamente final
            }
        }
        //para uma classe dentro de um metodo, voce precisa inicializar ela dentro do método para poder usá-la
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
