package test;

import static java.lang.Thread.sleep;

public class Desk implements Runnable {
    private Simulation s = null;
    private int deskNo = 0;

    private int servedCustomerCount = 0;
    private int soldItemCount = 0;
    private int spentTime = 0;

    public Desk(Simulation s, int deskNo) {
        this.s = s;
        this.deskNo = deskNo;
    }

    public void run() {
        System.out.println("Desk " + deskNo + " opening...");

        Customer c = null;
        while ((c = s.customerFactory.getInstanceWithRandomCapacity()) != null) {
            servedCustomerCount++;
            for (int i = c.getItemCount(); i > 1; i--) {
                soldItemCount++;
                spentTime += s.getRandomIntInRangeEnclosed(s.ITEM_DURATION_S_MIN, s.ITEM_DURATION_S_MAX);
            }
            //get short break after each customer ;)
            try {
                sleep((long) s.getRandomIntInRangeEnclosed(s.ITEM_DURATION_S_MIN, s.ITEM_DURATION_S_MAX));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        s.results.add(new DeskReport(deskNo, servedCustomerCount, soldItemCount, spentTime));
        System.out.println("Desk " + deskNo + "\tclosing.\tcustomers " + servedCustomerCount + "\titems " + soldItemCount + "\ttime(s) " + spentTime);
    }
}
