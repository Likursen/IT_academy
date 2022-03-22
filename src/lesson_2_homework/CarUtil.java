package lesson_2_homework;

import java.util.Random;

public class CarUtil {
    public static Car[] CarGenerator(int carCount) {
        Car[] carArray = new Car[carCount];
        Random rnd = new Random();
        for (int i = 0; i < carArray.length; i++) {
            String randomString = new String();
            randomString = (char)rnd.nextInt(127)+1;
            carArray[i] = new Car(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble(), randomString, randomString);
        }
        return carArray;
    }
}
