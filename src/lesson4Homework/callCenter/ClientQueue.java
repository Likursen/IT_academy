package lesson4Homework.callCenter;

import lesson4Homework.domain.Client;
import lesson4Homework.utils.CallCenterUtils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ClientQueue extends Thread {
    private static BlockingQueue<Client> clientQueue = new LinkedBlockingQueue<>();

    public static BlockingQueue<Client> getClientQueue() {
        return clientQueue;
    }

    public static void setClientQueue(BlockingQueue<Client> clientQueue) {
        ClientQueue.clientQueue = clientQueue;
    }

    //    The method starts the creation of a queue of clients
    @Override
    public void run() {
        try {
            CallCenterUtils.queueFactory();
        } catch (InterruptedException ex) {
            System.err.println("Queue error");
        }
    }
}
