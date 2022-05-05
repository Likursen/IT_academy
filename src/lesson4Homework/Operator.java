package lesson4Homework;

public class Operator implements Runnable {
    private int operatorId;
    private boolean isFree = true;

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

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public void run() {
        while (CallCenter.isWork) {
            try {
         //   CallCenter.closeCallCenter();
                solve();
            } catch (InterruptedException e) {
                System.out.println("ошбика в операторе");
                e.printStackTrace();
            }
        }
    }

    private void solve() throws InterruptedException {
        isFree = false;
        Thread.sleep(200);
        System.out.println("оператор №" + operatorId + " соединен с клиентом " + ClientQueue.clientQueue.take().getClientId());
        isFree = true;
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
