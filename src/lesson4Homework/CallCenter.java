package lesson4Homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenter extends Thread {
    private static final int DEFAULT_OPERATORS_COUNT = 4;
    private static final Operator[] OPERATORS = new Operator[DEFAULT_OPERATORS_COUNT];
    ClientQueue clientQueue = new ClientQueue();

    @Override
    public void run() {
        System.out.println("Колл-центр начал работу");
        operatorsFactory(DEFAULT_OPERATORS_COUNT);
        clientQueue.start();
    }

    public static void operatorsFactory(int count) {
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < OPERATORS.length; i++) {
            executorService.submit(new Operator(i + 1));
        }

//        if (ClientQueue.clientQueue.isEmpty()) {
////            executorService.shutdownNow();
//            System.out.println("STOP Колл-центр завершил работу");
//        }
    }
}
