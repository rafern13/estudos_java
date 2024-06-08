package exercicios.test;

public class Categorias {
    public static void main (String[] args){
        byte idade;
        idade = 17;
        boolean isInfantil = idade < 15;
        boolean isJuvenil = idade >= 15 && idade < 18;
        if (isInfantil){
            System.out.println("É da categoria infantil pois tem a idade: "+idade);
        } else if (isJuvenil) {
            System.out.println("É da categoria infantil pois tem a idade: "+idade);
        }else{
            System.out.println("É da categoria adulta pois tem a idade: "+idade);
        }
    }
}
