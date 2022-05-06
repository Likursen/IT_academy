package lesson4Homework.utils;

import lesson4Homework.callCenter.CallCenter;
import lesson4Homework.domain.Client;
import lesson4Homework.callCenter.ClientQueue;
import lesson4Homework.domain.Operator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenterUtils {
    public static final int DEFAULT_CLIENTS_COUNT = 20;
    public static final int DEFAULT_OPERATORS_COUNT = 4;
    private static final int ADD_CLIENT_DELAY = 30;

    //    Method generates DEFAULT_CLIENTS_COUNT clients and adds them to the client queue
    public static void queueFactory() throws InterruptedException {
        for (int i = 1; i <= DEFAULT_CLIENTS_COUNT; i++) {
            Thread.sleep(ADD_CLIENT_DELAY);
            System.out.println("Client №" + i + " added to queue");
            ClientQueue.getClientQueue().add(new Client(i));
        }
    }

    /*  The method creates threads in the DEFAULT_OPERATORS_COUNT count. Each thread implements the work
        of a call center operator. When the creation of the specified number of agent flows is completed,
        the ability to add new ones is not possible*/
    public static void operatorsFactory() {
        ExecutorService executorService = Executors.newFixedThreadPool(DEFAULT_OPERATORS_COUNT);
        for (int i = 1; i <= DEFAULT_OPERATORS_COUNT; i++) {
            executorService.submit(new Operator(i));
        }
        executorService.shutdown();
    }

    /*  The method changes the state of the IsWork field if all clients in the queue have run out. After that,
        the work of the call center stops and a message is displayed about the termination of the program*/
    public static void closeCallCenter() {
        while (CallCenter.isIsWork()) {
            if (ClientQueue.getClientQueue().size() == 0) {
                System.out.println("\nCall center closed");
                CallCenter.setIsWork(false);
            }
        }
    }
}
