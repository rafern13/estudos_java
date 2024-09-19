package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou: %d\n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s finalizou\n", Thread.currentThread().getName());

    }
}

public class ExecutorsTest01 {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //singleThreadPool usa so uma pra todas as tasks
        //cachedThreadPool vai pegar o quanto for necessário e desligar depois de 60s kkkj

        //ensse caso, o executor se responsabiliza por iniciar ou fehcar as threads. ou seja ele encapsula e deixa mais modulável
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        //quando o numero de serviços é maior do que o numero de threads que executor pode pegar, ai ele espera threads ficarem livres e manda elas fazer o restante do trabalho
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("programa finalizado");

    }
}
