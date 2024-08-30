package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        //essa interface faz lock na thread de adicionar coisas quando a lista ta cheia, e fica esperando que abra espaço para fazer a adição e dar unlock
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("William");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Suane");
        System.out.println("Trying to add another value");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

    public RemoveFromQueue(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), bq.take());
            //lembrando que o take, caso nao haja nada dentro da Queue, vai esperar até que algo seja adicionado
            //ou seja, ele faz um lock ali tambem kkkj
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

}
