package lesson_2_homework;

import java.util.Random;

public class Car implements CarMarkAndModelInterface, CarMove {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        if (weight != car.weight) return false;
        if (Double.compare(car.engineValue, engineValue) != 0) return false;
        if (Double.compare(car.power, power) != 0) return false;
        if (!mark.equals(car.mark)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = weight;
        temp = Double.doubleToLongBits(engineValue);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + mark.hashCode();
        result = 31 * result + model.hashCode();
        return result;
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

    public String randomMark() {
        Random random = new Random();
        return switch (random.nextInt(10)) {
            case 0 -> CarMarkAndModelInterface.mark1;
            case 1 -> CarMarkAndModelInterface.mark2;
            case 2 -> CarMarkAndModelInterface.mark3;
            case 3 -> CarMarkAndModelInterface.mark4;
            case 4 -> CarMarkAndModelInterface.mark5;
            case 5 -> CarMarkAndModelInterface.mark6;
            case 6 -> CarMarkAndModelInterface.mark7;
            case 7 -> CarMarkAndModelInterface.mark8;
            case 8 -> CarMarkAndModelInterface.mark9;
            case 9 -> CarMarkAndModelInterface.mark10;
            default -> "Model error";
        };
    }

    public String randomModel() {
        Random random = new Random();
        return switch (random.nextInt(10)) {
            case 0 -> CarMarkAndModelInterface.model1;
            case 1 -> CarMarkAndModelInterface.model2;
            case 2 -> CarMarkAndModelInterface.model3;
            case 3 -> CarMarkAndModelInterface.model4;
            case 4 -> CarMarkAndModelInterface.model5;
            case 5 -> CarMarkAndModelInterface.model6;
            case 6 -> CarMarkAndModelInterface.model7;
            case 7 -> CarMarkAndModelInterface.model8;
            case 8 -> CarMarkAndModelInterface.model9;
            case 9 -> CarMarkAndModelInterface.model10;
            default -> "Model error";
        };
    }

    @Override
    public void turn(Car[] carArrays, int number, String vector) {
        System.out.println(carArrays[number].getModel() + " сar turn " + vector);
    }

    @Override
    public void move(Car[] carArrays, int number, int speed) {
        System.out.println(carArrays[number].getModel() + " сar travels " + (speed * 3) + "km in 3 hours");
    }
}
