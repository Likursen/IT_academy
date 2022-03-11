//Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
package lesson_1_Homework;

public class Task4 {
    public static void main(String[] args) {
        int hightLimit = 100;
        for (int i = 0; i <= hightLimit; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
