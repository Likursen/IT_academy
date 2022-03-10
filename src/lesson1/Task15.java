/*Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
for
while
do while*/
package lesson1;

public class Task15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }

        int y = 1;
        do {
            System.out.println(y);
            y++;
        }
        while (y <= 100);
    }
}
