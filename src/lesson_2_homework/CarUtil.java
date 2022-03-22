package lesson_2_homework;


import java.util.Random;

public class CarUtil {
    public static Car[] carGenerator(int carCount) {
        Car[] carArray = new Car[carCount];
        Random rnd = new Random();
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car(rnd.nextInt(1000, 2000), rnd.nextDouble(1.0, 4.0), rnd.nextDouble(45.0, 300.0), "lada", "model");
        }
        return carArray;
    }

    public static void carInfo(Car[] carArray) {
        for (Car i : carArray) {
            System.out.println(i);
        }
    }
}

