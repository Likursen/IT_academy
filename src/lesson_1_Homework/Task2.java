//Напишите метод, который будет увеличивать каждый элемент массива на 10%
package lesson_1_Homework;


public class Task2 {
    public static void main(String[] args) {
        int arraySize = 5;
        double multiplier = 1.1;
        double[] array = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            System.out.println(array[i] * multiplier + " ");
        }
    }
}
