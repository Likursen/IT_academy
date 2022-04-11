/*Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
чтобы значение первой оказалось во второй, а второй - в первой.*/
package lesson1Homework;

public class Task9 {
    public static void main(String[] args) {
        int firstNum = 1;
        int secondNum = 3;
        System.out.println(firstNum + " " + secondNum);
        int tempNum = firstNum;
        firstNum = secondNum;
        secondNum = tempNum;
        System.out.println(firstNum + " " + secondNum);
    }
}
