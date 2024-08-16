package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {

    //em suma, em geral o for comum vai ser muito bom aqui
    //agora, se voce quer deixar realmente otimizado usando o iterator das streams
    //ent voce precisa usar as Streams com tipo para evitar boxing e unboxing e ai usar os paralelos, pois vc passa
    //os parametros de funcionamento e as threads conseguem se dividir da melhor forma
    //literalmente, do jeito mais otimizado, a stream com iterator para 100M foi na metade do tempo do for, que ja tava muito rapido
    //nesse caso, acho que o forSum so é melhor quando voce ta trabalhando com valores pequenos
    //para valores maiores, dividir entre threads é sempre uma boa opção pq vc nao exige muito clock do processador
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);//34ms
        sumStreamIterate(num);//demora mt mais pq cada iteração faz boxing e autoboxing, o que é muito lento

//        sumParallelStreamIterate(num);//pc tankou nao kkkkkkkkkkkkkkkkkkkkkk
        sumLongStreamIterate(num);//1130ms
        sumParallelLongStreamIterate(num);//17ms

        //limit e findfirst NÃO sao boas operações para voce usar com streams, ja o findAny é até legal
        /*
        existem colções boas e ruins para processamento paralelo:
        - arrayList - Mt bom
        - linkedList- uma bosta
        - iterate do stream - ruim
        - rangeClosed() - ja é melhorzin
        -set - bastante ok

        o ideal é fazer uma pesquisa e ver como essas coleções se comportam com processamento paralelo

        Tambem é sempre melhor de trabalhar com parallel() quando voce tem um stream com tamanho definido, pois as
        threads se organizam da melhor forma. Se o Stream for criado dinamicamente, voce pode ter um problema feio (MEU PC QUASE EXPLODIU)
         */

    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;

        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end-init)+"ms\n");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end-init)+"ms\n");
    }

    //[1,2,3,4,5,6,7,8,9,0]
    //thread 1 - soma de 1 ate 5
    //thread 2 - soma de 6 ate 0
    private static void sumParallelStreamIterate(long num) {
        System.out.println("sumParallelStreamIterate");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end-init)+"ms\n");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("sumLongStreamIterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).reduce(0l, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end-init)+"ms\n");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0l, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result+ " "+(end-init)+"ms\n");
    }
}
