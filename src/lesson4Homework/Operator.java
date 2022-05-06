package lesson4Homework;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Operator implements Runnable {
    private int operatorId;
    Random timeToSolve = new Random();

    public Operator(int id) {
        System.out.println("Оператор " + id + " начал работу");
        this.operatorId = id;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public void run() {
        while (CallCenter.isWork) {
            try {
                solve();
            } catch (InterruptedException e) {
                System.out.println("ошибка в операторе");
                e.printStackTrace();
            }
        }
    }

    private void solve() throws InterruptedException {
        System.out.println("оператор №" + operatorId + " соединен с клиентом " +
                Objects.requireNonNull(ClientQueue.clientQueue.poll(1000, TimeUnit.MILLISECONDS)).clientId);
        Thread.sleep(timeToSolve.nextInt(100, 500));
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
