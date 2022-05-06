package lesson4Homework.callCenter;

import lesson4Homework.utils.CallCenterUtils;

public class CallCenter extends Thread {

    private static boolean isWork = true;
    ClientQueue clientQueue = new ClientQueue();

    public static boolean isIsWork() {
        return isWork;
    }

    public static void setIsWork(boolean isWork) {
        CallCenter.isWork = isWork;
    }

    /* The method starts the call center. Creation of agents and customer queue starts. The method waits
    for the thread to complete to create a queue of clients, and then launches the closeCallCenter method,
    which waits for all clients to be processed, after which it stops the operators and closes the call center.*/
    @Override
    public void run() {
        System.out.println("The call center started working");
        CallCenterUtils.operatorsFactory();
        clientQueue.start();
        try {
            clientQueue.join();
        } catch (InterruptedException e) {
            System.err.println("Error while waiting for queue creation thread to complete");
        }
        CallCenterUtils.closeCallCenter();
    }
}
