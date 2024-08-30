package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    public final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    //condition retorna uma classe pra uma instancia especifica de lock
    //portanto, com varios locks, voce precisa de varias conditions
    private boolean open = true;

    public boolean isOpen() { return open; }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista.");
            this.emails.add(email);
            condition.signalAll();//signal e signalAll parece notify e notifyAll
        } finally {
            lock.unlock();
        }

    }

    //esse metodo aqui se for chamado, coloca uma thread para checar se tem emails e ela fica em modo de espera (via o wait() )se a lista tiver vazia
    //ai se nao tiver vazia, retorna o primeiro email usando o poll()
    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while(emails.isEmpty()) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName()+ " Não tem email disponivel na lista. Entrando em modo de espera.");
                condition.await();//so da para chamar o wait se tratar a exceção e se tiver em um lock, ou seja, dentro de um synchronized
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que nao estamos mais pegando emails. ");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
