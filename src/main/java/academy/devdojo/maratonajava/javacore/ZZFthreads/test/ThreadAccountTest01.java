package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) throws InterruptedException {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private void withDrawal(int amount) {//modificador syncrhonized faz com que surja um lock no metodo, entao nao podem ter duas threads executando ele simultaneamente
        System.out.println(getThreadName()+ " ***** fora do synchronized");
        synchronized (account) {//aq, so entra uma thread por vez tambem
            System.out.println(getThreadName()+ " #### dentro do synchronized");
            if(account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withDrawal(amount);

                System.out.println(getThreadName() + " completou o saque. Valor atual da conta: "+account.getBalance());
            } else {
                System.out.println("Sem dinheiro para "+ getThreadName() +" efetuar o saque "+account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
