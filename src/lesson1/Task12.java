/*Напишите программу, в которой используются две переменные логического типа (boolean),
присвойте им значения и выведете для каждой переменной на экран строку "истина",
если переменная имеет значение true и "ложь", если переменная имеет значение false.*/
package lesson1;

public class Task12 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a) {
            System.out.println(a + " истина");
        } else System.out.println(a + " Ложь");
        if (b) {
            System.out.println(b + " истина");
        } else System.out.println(b + " Ложь");
    }
}
