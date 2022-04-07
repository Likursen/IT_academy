//Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)
package lesson1Homework;

public class Task6 {
    public static void main(String[] args) {
        int hightLimit = 100;
        for (int i = 0; i <= hightLimit; i += 2)
            System.out.println(i);
    }
}
