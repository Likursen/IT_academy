/*Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
Минимум, максимум и шаг указываются пользователем */
package lesson1;

public class Task16 {
    public static void main(String[] args) {
        int startPoint = 5;
        int endPoint = 37;
        int step = 10;
        for (int i = startPoint; i <= endPoint; i += step) {
            System.out.println(i);
        }
    }
}
