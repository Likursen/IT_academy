/*Создайте программу с двумя переменными целого типа, присвойте им значения,
если первая переменная больше второй, то увеличьте её значение на 3,
иначе увеличьте значение второй переменной на 8.
В конце программы выведите значения обоих чисел на экран.*/
package lesson1Homework;

public class Task14 {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 4;
        if (firstNum > secondNum) firstNum += 3;
        else secondNum += 8;
        System.out.println(firstNum + " " + secondNum);
    }
}
