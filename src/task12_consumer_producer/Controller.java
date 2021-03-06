package task12_consumer_producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {
    private static AtomicInteger atomicInteger;

    public static void main(String[] args) throws InterruptedException {
        atomicInteger = new AtomicInteger(0);

        Board board = new Board();

//        startPersonProducer(board, "Name1");
//        startPersonProducer(board, "Name2");
//        startPersonProducer(board, "Name3");
//
//        startPersonConsumer(board, "NameConsumer1");
//        startPersonConsumer(board, "NameConsumer2");
//        startPersonConsumer(board, "NameConsumer3");
//        startPersonConsumer(board, "NameConsumer4");
//        startPersonConsumer(board, "NameConsumer5");
//        startPersonConsumer(board, "NameConsumer6");
//        startPersonConsumer(board, "NameConsumer7");

        String name = "Name";

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 3; i++) {
            Runnable r = new PersonConsumer(name + "consumer" + i, board, atomicInteger);
            executorService.execute(r);
        }

        for (int i = 0; i < 7; i++) {
            Runnable r = new PersonProducer(name + "producer" + i, board, atomicInteger);
            executorService.execute(r);
        }

        executorService.awaitTermination(2, TimeUnit.SECONDS);

        //Thread.sleep(2000);
        executorService.shutdownNow();

        // System.out.println(board.getLastMessage().getLikesCount());
    }

    private static Thread startPersonConsumer(Board board, String name) {
        Person person1 = new PersonConsumer(name, board, atomicInteger);
        return new Thread(person1);
    }

    private static Thread startPersonProducer(Board board, String name) {
        Person person1 = new PersonProducer(name, board, atomicInteger);
        return new Thread(person1);
    }
}
