/* Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
что сила тяжести равна 16% от силы тяжести на Земле.*/
package lesson1Homework;

public class Task1 {
    public static void main(String[] args) {
        double weightOnEarth = 64.0;
        double weightOnMoon = weightOnEarth * 0.16;
        System.out.println("Вес на Земле: " + weightOnEarth);
        System.out.println("Вес на Луне " + weightOnMoon);
    }
}
