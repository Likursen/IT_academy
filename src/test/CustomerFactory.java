package test;

public class CustomerFactory {

    private Simulation simulation;
    private int capacity = 0;

    public CustomerFactory(Simulation simulation, int capacity) {
        this.simulation = simulation;
        this.capacity = capacity;
    }

    public synchronized Customer getInstanceWithRandomCapacity() {
        if (capacity-- > 1) {
            return new Customer(this.simulation.getRandomIntInRangeEnclosed(1, 20));
        } else {
            return null;
        }
    }

}
