//Все элементы массива поделить на значение наибольшего элемента этого массива.
package lesson1;

public class Task17 {
    public static void main(String[] args) {
        int arraySize = 5;
        double[] array = new double[arraySize];
        double max = array[0];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nmax " + max);
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] / max + "  ");
        }
    }
}
