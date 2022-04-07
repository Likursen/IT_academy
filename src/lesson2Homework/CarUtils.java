package lesson2Homework;

import java.util.Arrays;
import java.util.Random;

public class CarUtils {
    public static Car[] carGeneration(int carCount) {
        Car[] carArray = new Car[carCount];
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car(getRandomWeight(), getRandomCylinderCapacity(), getRandomPower(), getRandomBrand(), getRandomModel());
        }
        return carArray;
    }

    public static void printCarInfo(Car[] carArray) {
        for (Car car : carArray) {
            System.out.println(car);
        }
    }

    public static int getRandomWeight() {
        return new Random().nextInt(900, 4000);
    }

    public static double getRandomCylinderCapacity() {
        return new Random().nextDouble(1, 4);
    }

    public static double getRandomPower() {
        return new Random().nextDouble(100, 3200);
    }

    public static String getRandomBrand() {
        Random random = new Random();
        return switch (random.nextInt(10)) {
            case 0 -> Named.BRAND_1;
            case 1 -> Named.BRAND_2;
            case 2 -> Named.BRAND_3;
            case 3 -> Named.BRAND_4;
            case 4 -> Named.BRAND_5;
            case 5 -> Named.BRAND_6;
            case 6 -> Named.BRAND_7;
            case 7 -> Named.BRAND_8;
            case 8 -> Named.BRAND_9;
            case 9 -> Named.BRAND_10;
            default -> "Model error";
        };
    }

    public static String getRandomModel() {
        Random random = new Random();
        return switch (random.nextInt(10)) {
            case 0 -> "Model 1";
            case 1 -> "Model 2";
            case 2 -> "Model 3";
            case 3 -> "Model 4";
            case 4 -> "Model 5";
            case 5 -> "Model 6";
            case 6 -> "Model 7";
            case 7 -> "Model 8";
            case 8 -> "Model 9";
            case 9 -> "Model 10";
            default -> "Model error";
        };
    }

    public static void carSortByBrand(Car[] array) {
        System.out.println("************SORTING************");
        Arrays.sort(array);
    }

}
