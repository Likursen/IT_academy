package lesson2Homework;

public class TestCar {

    public static void main(String[] args) {
        int carCount = 10;
        Car[] carGarage = CarUtils.carGeneration(carCount);
        CarUtils.printCarInfo(carGarage);
        CarUtils.carSortByBrand(carGarage);
        CarUtils.printCarInfo(carGarage);
        turn(carGarage[1], "left");
        path(carGarage[6], 123, 6);
    }

    private static void turn(Movable obj, String vector) {
        obj.turn(vector);
    }

    private static void path(Movable obj, int speed, int hours) {
        obj.path(speed, hours);
    }
}
