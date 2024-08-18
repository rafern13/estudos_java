package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    public final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;

    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista.");
            this.emails.add(email);
            this.emails.notifyAll();//esse notify all avisa que teve uma mudança nas coisas e ai as threads que estao em espera podem checar se tem trabalho
            //o notify simples avisa uma thread so aparentemente. Não parece ser muito util nao,
            //TODO voltar quando a thread estiver esperando
        }
    }

    //esse metodo aqui se for chamado, coloca uma thread para checar se tem emails e ela fica em modo de espera (via o wait() )se a lista tiver vazia
    //ai se nao tiver vazia, retorna o primeiro email usando o poll()
    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails) {
            while(emails.isEmpty()) {
                if(!open) return null;
                System.out.println(Thread.currentThread().getName()+ " Não tem email disponivel na lista. Entrando em modo de espera.");
                this.emails.wait();//so da para chamar o wait se tratar a exceção e se tiver em um lock, ou seja, dentro de um synchronized
            }
            return this.emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que nao estamos mais pegando emails. ");
            this.emails.notifyAll();
        }
    }
}
