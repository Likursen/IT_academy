package lesson4Homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenter extends Thread {
    private static final int DEFAULT_OPERATORS_COUNT = 3;
    public static boolean isWork = true;
    ClientQueue clientQueue = new ClientQueue();

    @Override
    public void run() {
        System.out.println("Колл-центр начал работу");
        operatorsFactory(DEFAULT_OPERATORS_COUNT);
        clientQueue.start();
        try {
            clientQueue.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (isWork) {
            if (ClientQueue.clientQueue.size() == 0) {
                closeCallCenter();
            }
        }
    }

    public static void operatorsFactory(int count) {
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            executorService.submit(new Operator(i + 1));
        }
        executorService.shutdown();
    }

    public static void closeCallCenter() {
        System.out.println("\nКолл центр завершил работу");
        isWork = false;
    }
}
