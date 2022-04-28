package lesson4Homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenter extends Thread {
    private static final int DEFAULT_OPERATORS_COUNT = 4;
    private static final Operator[] operators = new Operator[DEFAULT_OPERATORS_COUNT];

    @Override
    public void run() {
        ClientQueue clientQueue = new ClientQueue();
        System.out.println("Колл-центр начал работу");
        clientQueue.start();

        ExecutorService executorService = Executors.newFixedThreadPool(DEFAULT_OPERATORS_COUNT);
        for (int i = 0; i < operators.length; i++) {
            executorService.submit(new Operator(i + 1));

        }
        System.out.println("Колл-центр завершил работу");
        executorService.shutdown();
    }
}
