package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    //Atomic... implementa o multithreading e faz uma camada de abstração para facilitar aos usuarios.

    private Lock lock = new ReentrantLock(true);

    //esse atomic integer implementa para a manipulação de inteiros sem que voce precise tornar os metodos synchronized
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();//assim, independente de problemas ou nao, o lock será liberado e nao vai lançar exceções com thread lockada
        }
    }

    public int getCount(){
        return count;

    }

    public AtomicInteger getAtomicInteger () {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
                
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
