package lesson4Homework.domain;

import lesson4Homework.callCenter.CallCenter;
import lesson4Homework.callCenter.ClientQueue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Operator implements Runnable {
    private int operatorId;
    private final int WAITING_TIME = 1000; //standard waiting time for a new client
    Random randomTimeToTalk = new Random();
    private final int MIN_TIME_TO_TALK = 100; //minimum time of conversation between the client and the operator
    private final int MAX_TIME_TO_TALK = 500; //maximum time of conversation between the client and the operator


    public Operator(int id) {
        System.out.println("Operator №" + id + " started work");
        this.operatorId = id;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    /* The run method starts the execution of the talkWithClient
    method as long as the call center is active (isWork true)*/
    @Override
    public void run() {
        while (CallCenter.isIsWork()) {
            try {
                talkWithClient();
            } catch (InterruptedException e) {
                System.err.println("Operator error");
            }
        }
    }

    /*The method connects the operator to the first client from the queue (removes it). If during the time WAITING _TIME
    the operator does not receive a new client, then he stops working. The time for which the operator is connected to
    the clients is random (in the range from MIN_TIME_TO_TALK to MAX_TIME_TO_TALK milliseconds)*/
    private void talkWithClient() throws InterruptedException {
        Client getClient = ClientQueue.getClientQueue().poll(WAITING_TIME, TimeUnit.MILLISECONDS);
        if (getClient != null) {
            System.out.println("Operator №" + operatorId + " connect with client №" + getClient.getClientId());
        }
        Thread.sleep(randomTimeToTalk.nextInt(MIN_TIME_TO_TALK, MAX_TIME_TO_TALK));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operator operator)) return false;

        return operatorId == operator.operatorId;
    }

    @Override
    public int hashCode() {
        return operatorId;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operatorId=" + operatorId +
                '}';
    }
}
