/*Напишите программу, где двум строковым переменным присваиваются значения,
третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
Затем напечатайте значение третьей строковой переменной.*/
package lesson1Homework;

public class Task13 {
    public static void main(String[] args) {
        String string1 = "hello ";
        String string2 = "World!";
        String string3 = string1 + string2;
        System.out.println(string3);
    }
}
