package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

   /*
   inner classes podem ajudar a manter a coesao
   especialmente quando uma classe so é usada por outra. voce pode deixar ela interna que diminui a complexidade do codigo
    */

    //classes aninhadas ou nested classes
    class Inner {//classe interna tem acesso aos atributos e metodos da classe externa bebeee
        public void printAlterClassAttribute(){
            System.out.println(name);

        //se voce quiser usar o this dentro de uma inner class para referenciar a outerclass, voce precisa usar algo como
        //Outerclass.this...., ou seja, voce passa o nome da classe e depois o . this

            System.out.println(this);//aq vc ta chamando o this da Inner
            System.out.println(OuterClassesTest01.this);//aqui voce ta chamando o this da outer
        }

    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printAlterClassAttribute();
        inner2.printAlterClassAttribute();
    }
}
