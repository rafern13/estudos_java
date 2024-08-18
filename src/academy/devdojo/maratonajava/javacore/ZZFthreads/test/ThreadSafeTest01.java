package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }
    /*
    embora a lista seja thread safe, os dois metodos que mexem com ela aqui nao sao, entao nao vale de muita coisa
    o ideal seria deixar add() e removeFirst() como synchronized e dai daria tudo certo

    assim que coloquei synchronized, a lista poderia ser um arraylist comum que ainda funcionaria
     */
    public synchronized void removeFirst() {
        if(names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");

//        Runnable r = () -> {threadSafeNames.removeFirst();};//via lambda
        Runnable r = threadSafeNames::removeFirst;//via method reference
        new Thread(r).start();
        new Thread(r).start();

    }

}
