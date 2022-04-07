/*Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
for
while
do while*/
package lesson1Homework;

public class Task15 {
    public static void main(String[] args) {
        int hightLimit = 100;
        for (int i = 1; i <= hightLimit; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= hightLimit) {
            System.out.println(j);
            j++;
        }
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }
        while (k <= hightLimit);
    }
}
