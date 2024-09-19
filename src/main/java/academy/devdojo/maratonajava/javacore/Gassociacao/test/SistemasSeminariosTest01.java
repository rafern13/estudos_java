package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio2.Seminario;

public class SistemasSeminariosTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("UFMT CUIABÁ");

        Professor prof1 = new Professor("Nelcileno", "Algoritmos I");

        Professor prof2 = new Professor("Moises", "Algebra Linear");

        Professor prof3 = new Professor("Zezinho", "Algoritmos II");


        Aluno aluno1 = new Aluno("Rafael", 20);
        Aluno aluno2 = new Aluno("Lais", 19);
        Aluno aluno3 = new Aluno("Vitor", 18);
        Aluno aluno4 = new Aluno("Maria Julia", 19);
        Aluno aluno5 = new Aluno("Enzo", 19);

        Aluno[] alunosAlgI = new Aluno[]{aluno1, aluno2};
        Aluno[] alunosAlgLinear = new Aluno[]{aluno3, aluno4, aluno5};

        Seminario seminario1 = new Seminario("Linguagem C", local1);

        Seminario seminario2 = new Seminario("Algebra e Matrizes", local1);

        prof1.setSeminarios(new Seminario[]{seminario1, seminario2});
        prof2.setSeminarios(new Seminario[]{seminario2});
        prof3.setSeminarios(new Seminario[]{seminario1});

        seminario1.setAlunos(alunosAlgI);
        seminario2.setAlunos(alunosAlgLinear);

        seminario1.imprime();
        seminario2.imprime();

        aluno1.setSeminario(seminario1);
        aluno1.imprime();

        prof1.imprime();
        prof2.imprime();
        prof3.imprime();

        Local local2 = new Local("UFMT SINOP");
        seminario1.setLocal(local2);
        seminario1.imprime();
    }
}
