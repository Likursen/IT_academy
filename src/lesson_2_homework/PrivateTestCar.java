package lesson_2_homework;

public class PrivateTestCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        Car car2 = new Car(1564, 2.3, 123.3, "Tesla", "Model Y");
        System.out.println(car2);
        Car car3 = new Car("Lada", "Largus");
        System.out.println(car3);
        CarUtil.CarGenerator(10);
        System.out.println();

    }
}
