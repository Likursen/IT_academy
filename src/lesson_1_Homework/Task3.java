/*Напишите метод, который будет проверять является ли число палиндромом
(одинаково читающееся в обоих направлениях).*/
package lesson_1_Homework;

public class Task3 {
    public static void main(String[] args) {
        int number = 123321;
        int tempNumber = number;
        int halfOfSymbolCount = 0;
        int symbolCount = 0;
        int divider = 10;
        while (number != 0) {
            symbolCount++;
            number /= divider;
        }
        number = tempNumber;
        int[] numberOfNumberArray;
        numberOfNumberArray = new int[symbolCount];
        for (int i = 0; i < symbolCount; i++) {
            numberOfNumberArray[i] = (int) (number / Math.pow(10, i) % divider);
            halfOfSymbolCount = i / 2 > 0 ? i / 2 : 1;
        }
        for (int i = 0; i < halfOfSymbolCount; ) {
            if (numberOfNumberArray[i] != numberOfNumberArray[symbolCount - 1 - i]) {
                System.out.println(number + " не является палиндромом");
                break;
            } else {
                i++;
            }
            if (i == halfOfSymbolCount) System.out.println(number + " является палиндромом");
        }
    }
}
