//Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.
package lesson1;

public class Task11 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = 9;
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
