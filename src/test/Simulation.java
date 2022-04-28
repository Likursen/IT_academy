package test;

import test.Customer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Simulation {

    private static final Random globalRandom = new Random(System.currentTimeMillis());

    public synchronized int getRandomIntInRangeEnclosed(int min, int max){
        return globalRandom.nextInt((max - min + 1) + min);
    }

    private final static int CUSTOMER_NUMBER = 3000;
    private final static int DESK_NUMBER = 6;

    public final int ITEM_DURATION_S_MIN = 3;
    public final int ITEM_DURATION_S_MAX = 8;

    public final CustomerFactory customerFactory = new CustomerFactory(this, CUSTOMER_NUMBER);

    public final ArrayList<DeskReport> results = new ArrayList<DeskReport>(DESK_NUMBER);

    public void perform(){
        ExecutorService executor = Executors.newFixedThreadPool(DESK_NUMBER);
        for (int i = 1; i <= DESK_NUMBER; i++) {
            executor.submit(new Desk(this, i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void printResult(){
        int maxTimeS = 0;
        int maxItems = 0;
        int maxCustomers = 0;

        int minItems = Integer.MAX_VALUE;
        int minCustomers = Integer.MAX_VALUE;

        for(DeskReport r : results){
            if(r.getSpentTime() > maxTimeS){
                maxTimeS = r.getSpentTime();
            }

            if(r.getSoldItemCount() > maxItems){
                maxItems = r.getSoldItemCount();
            }
            if(r.getSoldItemCount() < minItems){
                minItems = r.getSoldItemCount();
            }


            if(r.getServedCustomerCount() > maxCustomers){
                maxCustomers = r.getServedCustomerCount();
            }
            if(r.getServedCustomerCount() < minCustomers){
                minCustomers = r.getServedCustomerCount();
            }

        }

        Date date = new Date(maxTimeS * 1000L);
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String dateFormatted = formatter.format(date);


        System.out.println("---------------- RESULTS ----------------");
        System.out.println(DESK_NUMBER + " desks served " + CUSTOMER_NUMBER + " customers in " + dateFormatted);
        System.out.println("Troughput min ~ max:");
        System.out.println(minItems + "\t~\t" + maxItems + " \titems/desk");
        System.out.println(minCustomers + "\t~\t" + maxCustomers + "\tcustomers/desk");
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.perform();
        sim.printResult();
    }



    private void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

