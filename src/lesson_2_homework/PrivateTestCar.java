package lesson_2_homework;

public class PrivateTestCar {

    public static void main(String[] args) {
        int carCount = 10;
        CarMove carMove = new Car();
        Car[] carGarage = CarUtil.carGenerator(carCount);
        CarUtil.carInfo(carGarage);
        CarUtil.carSortByWeight(carGarage);
        CarUtil.carInfo(carGarage);
        carMove.turn(carGarage, 2, "left");
        carMove.move(carGarage,1,156);

        }
    }
