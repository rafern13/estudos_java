package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//       é uma junção dessas 3 aqui papai: ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        //em geral voce vai querer usar add pra adicionar imediatamente. Se der certo retorna true
        //e se der errado lança exceção kkkj (por exemplo se faltar espaço)
        System.out.println(tq.add("William"));

        //se vc nao tem ctz que vai caber, voce usa o offer() dai, que ele adiciona se possível retornando true, ou retorna false se nao couber
        System.out.println(tq.offer("William"));

        //esse aqui vai tentar adicionar por 20s e depois desistir
        System.out.println(tq.offer("William", 20, TimeUnit.SECONDS));

        //put vai inserir na queue e, caso nao haja espaço, vai esperar dando lock na thread
        tq.put("Suane");

        if (tq.hasWaitingConsumer()) {
            //ttransfer so vai colocar algo na queue se ja tiver um consumer pronto pra usar o bglh kkj (vai fazer lock e esperar infinitamente dai
            //por isso vc acaba colocando ele dentro de um if hasWaitingConsumer que retorna true so qnd tem alguem esperando
            tq.transfer("DevDojo");
        }

        //se tiver um consumer esperando, ele vai adicionar e retornar true, otherwise, vai retornar falso e desistir
        //overall, parece algo melhor que usar transfer diretamente, evita uns lock sinistro
        tq.tryTransfer("Academy");

        //esse metodo tenta olhar pra cabeca da queue, tipo um peek, mas retorna exceção se a lista estiver vazia
        System.out.println(tq.element());

        System.out.println(tq.peek());//retorna null se tiver vazia

        System.out.println(tq.poll());//retorna e remove um elemento, ou retorna null se tiver vazia

        System.out.println(tq.take());//esse aq meio que locka a thread se n houver elemento pa ele pegar kkj
    }
}
