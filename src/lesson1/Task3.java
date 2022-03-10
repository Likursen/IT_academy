/*Напишите метод, который будет проверять является ли число палиндромом
(одинаково читающееся в обоих направлениях).*/
package lesson1;

public class Task3 {
    public static void main(String[] args) {
        int number = 1234554321;
        int halfNumber = 0;
        int numberCount = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            numberCount++;
            tempNumber /= 10;
        }
        int[] numberArray;
        numberArray = new int[numberCount];
        for (int i = 0; i < numberCount; i++) {
            numberArray[i] = number / (int) (Math.pow(10, i)) % 10;
            halfNumber = i / 2 > 0 ? i / 2 : 1;
        }
        for (int i = 0; i <= halfNumber; ) {
            if (numberArray[i] != numberArray[numberCount - 1 - i]) {
                System.out.println(number + " не является полиндромом");
                break;
            } else {
                i++;
            }
            if (i == halfNumber)
                System.out.println(number + " является полиндромом");
        }
    }
}
