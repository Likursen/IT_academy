package lesson_2_homework;

public class Car implements Movable, Comparable<Car> {
    private int weight;
    private double cylinderCapacity;
    private double power;
    private String brand;
    private String model;

    public Car() {
        weight = 0;
        cylinderCapacity = 0;
        power = 0;
        brand = "Unknown brand";
        model = "Unknown model";
    }

    public Car(String mark, String model) {
        this.brand = mark;
        this.model = model;
    }

    public Car(int weight, double engineValue, double power, String mark, String model) {
        this.weight = weight;
        this.cylinderCapacity = engineValue;
        this.power = power;
        this.brand = mark;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car that = (Car) o;

        if (weight != that.weight) return false;
        if (Double.compare(that.cylinderCapacity, cylinderCapacity) != 0) return false;
        if (Double.compare(that.power, power) != 0) return false;
        if (!brand.equals(that.brand)) return false;
        return model.equals(that.model);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = weight;
        temp = Double.doubleToLongBits(cylinderCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + brand.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", engineValue=" + cylinderCapacity +
                ", power=" + power +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int compareTo(Car o) {
        return this.brand.compareTo(o.brand);
    }

    @Override
    public void turn(String vector) {
        System.out.println("Car turn " + vector);
    }

    @Override
    public void path(int speed, int hours) {
        System.out.println("Car path is " + (speed * hours) + " km");
    }
}
