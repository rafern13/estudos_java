package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}


public class AnonymousClassesTest01 {
    public static void main(String[] args) {

        /*
        Basicamente eu criei uma subclasse anônima, ela nem nome tem onde eu posso modificar o comportamento de um metodo
        sem precisar fazer uma classe nova so para isso. Lembrando que ela tem apenas as caracteristicas que a
        sua superclasse
         */
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.print("Walking in the shadows and ");
                jump();
            }

            public void jump() {
                /*
                como esse metodo so existe dentro da superclasse anonima, ele nunca podera ser chamado
                de fora dessa classe. Mas é claro que vc pode criar metodos privados que vao funcionar
                dentro da classe sobrescrita da subClasse anonima, que nesse caso é o walk()
                 */
                System.out.println("jumping");
            }
        };
        animal.walk();
    }
}
