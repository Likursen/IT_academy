//Все элементы массива поделить на значение наибольшего элемента этого массива.
package lesson_1_Homework;

public class Task17 {
    public static void main(String[] args) {
        int arraySize = 5;
        int band = 100;
        double[] numberArray = new double[arraySize];
        double maxNumber = numberArray[0];
        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = (int) (Math.random() * band);
            System.out.print(numberArray[i] + "  ");
            if (numberArray[i] > maxNumber) {
                maxNumber = numberArray[i];
            }
        }
        System.out.println("\nmax " + maxNumber);
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numberArray[i] / maxNumber + "  ");
        }
    }
}
