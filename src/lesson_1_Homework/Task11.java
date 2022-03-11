//Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
package lesson_1_Homework;

public class Task11 {
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 5;
        int thirdNum = 9;
        int maxNum = firstNum;
        if (secondNum > maxNum) {
            maxNum = secondNum;
        }
        if (thirdNum > maxNum) {
            maxNum = thirdNum;
        }
        System.out.println(maxNum);
    }
}
