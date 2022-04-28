package lesson4Homework;

public class Operator implements Runnable {
    private int operatorId;

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
        try {
            while (true) solve();
        } catch (InterruptedException e) {
            System.out.println("ошбика в операторе");
            e.printStackTrace();
        }
    }

    private void solve() throws InterruptedException {
        System.out.println("оператор №" + operatorId + " соединен с клиентом " + ClientQueue.clientQueue.take().getClientId());
                Thread.sleep(500);
    }
}
