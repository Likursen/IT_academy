//Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
package lesson1;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
