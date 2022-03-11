//Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)
package lesson_1_Homework;

public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        int lowLimit = 0;
        int hightLimit = 200;
        for (int i = lowLimit; i <= hightLimit; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
