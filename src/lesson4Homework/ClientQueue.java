package lesson4Homework;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ClientQueue extends Thread {
    private static final int DEFAULT_CLIENTS_COUNT = 15;
    public static BlockingQueue<Client> clientQueue = new LinkedBlockingQueue<>();

    @Override
    public void run() {
        try {
            queueFactory();
        } catch (InterruptedException ex) {
            System.out.println("создание очереди прервано");
        }
    }

    private static void queueFactory() throws InterruptedException {
        for (int i = 0; i < DEFAULT_CLIENTS_COUNT; i++) {
            Thread.sleep(50);
            clientQueue.put(new Client(i + 1));
            System.out.println("клиент " + (i + 1) + " стал в очередь");
        }
    }
}
