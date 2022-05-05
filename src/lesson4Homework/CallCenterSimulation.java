package lesson4Homework;

public class CallCenterSimulation {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        callCenter.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}