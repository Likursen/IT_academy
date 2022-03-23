package lesson_2_homework;


import java.util.Random;

public class CarUtil {
    public static Car[] carGenerator(int carCount) {
        Car car = new Car();
        Car[] carArray = new Car[carCount];
        Random random = new Random();
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car(random.nextInt(1000, 2000), random.nextDouble(1.0, 4.0),
                    random.nextDouble(45.0, 300.0), car.randomMark(), car.randomModel());
        }
        return carArray;
    }

    public static void carInfo(Car[] carArray) {
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i]);
        }
    }

    public static Car[] carSortByWeight(Car[] carArray) {
        System.out.println("*********SORTING*********");
        Car temp;
        for (int i = 0; i < carArray.length - 1; i++) {
            for (int j = 0; j < carArray.length - 1 - i; j++) {
                if (carArray[j].getWeight() > carArray[j + 1].getWeight()) {
                    temp = carArray[j];
                    carArray[j] = carArray[j + 1];
                    carArray[j + 1] = temp;
                }
            }
        }
        return carArray;
    }
}

