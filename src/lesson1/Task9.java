/*Объявить 2 переменных целого типа. Необходимо поменять значения переменных так,
чтобы значение первой оказалось во второй, а второй - в первой.*/
package lesson1;

public class Task9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a + " " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
