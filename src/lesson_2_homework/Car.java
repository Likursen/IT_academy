package lesson_2_homework;

public class Car {
    private int weight;
    private double engineValue;
    private double power;
    private String mark;
    private String model;

    public Car() {
        weight = -1;
        engineValue = -1;
        power = -1;
        mark = "Unknown mark";
        model = "Unknown model";
    }

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Car(int weight, double engineValue, double power, String mark, String model) {
        this.weight = weight;
        this.engineValue = engineValue;
        this.power = power;
        this.mark = mark;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(double engineValue) {
        this.engineValue = engineValue;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", engineValue=" + engineValue +
                ", power=" + power +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
