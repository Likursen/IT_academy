package lesson4Homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallCenter extends Thread {
    private static final int DEFAULT_OPERATORS_COUNT = 4;
    private static final Operator[] OPERATORS = new Operator[DEFAULT_OPERATORS_COUNT];
    public static boolean isWork = true;
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
        executorService.shutdown();
    }

//    public static void closeCallCenter() {
//
//        int counter = 0;
//        for (Operator operator : OPERATORS) {
//            if (operator.isFree()) {
//                counter++;
//            }
//            if (counter == DEFAULT_OPERATORS_COUNT) {
//                System.out.println("Колл центр завершил работу");
//                isWork = false;
//            }
//
//        }
//    }
}
