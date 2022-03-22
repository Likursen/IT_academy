package lesson_2_homework;

public class PrivateTestCar {

    public static void main(String[] args) {
        int carCount = 3;
        Car[] carGarage = CarUtil.carGenerator(carCount);
        CarUtil.carInfo(carGarage);
    }
}
