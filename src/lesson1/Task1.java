/* Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
что сила тяжести равна 16% от силы тяжести на Земле.*/
package lesson1;

public class Task1 {
    public static void main(String[] args) {
        double weightEarth = 64.0;
        double weightMoon;
        weightMoon = weightEarth * 0.16;
        System.out.println("Вес на Земле: " + weightEarth);
        System.out.println("Вес на Луне " + weightMoon);
    }
}
