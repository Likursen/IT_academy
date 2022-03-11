//Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)
package lesson_1_Homework;

public class Task5 {
    public static void main(String[] args) {
        int hightLimit = 15;
        for (int i = 0; i <= hightLimit; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }
}
