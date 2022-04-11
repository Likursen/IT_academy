/*Напишите программу, в которой используются две переменные логического типа (boolean),
присвойте им значения и выведете для каждой переменной на экран строку "истина",
если переменная имеет значение true и "ложь", если переменная имеет значение false.*/
package lesson1Homework;

public class Task12 {
    public static void main(String[] args) {
        boolean boolOne = true;
        boolean boolTwo = false;
        if (boolOne) {
            System.out.println(boolOne + " истина");
        } else System.out.println(boolOne + " Ложь");
        if (boolTwo) {
            System.out.println(boolTwo + " истина");
        } else System.out.println(boolTwo + " Ложь");
    }
}
