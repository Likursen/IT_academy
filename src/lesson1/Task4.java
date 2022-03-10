//Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
package lesson1;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
