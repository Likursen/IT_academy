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
        while (true)
                solve();
            } catch (InterruptedException e) {
                System.out.println("ошбика в операторе");
                e.printStackTrace();
            }

    }

    private void solve() throws InterruptedException {
        Thread.sleep(5);
        System.out.println("оператор №" + operatorId + " соединен с клиентом " + ClientQueue.clientQueue.take().getClientId());
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
