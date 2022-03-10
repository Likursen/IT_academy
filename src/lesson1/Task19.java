/*Напишите программу, которая будет считать количество
часов, минут и секунд в n-ном количестве суток.*/
package lesson1;

public class Task19 {
    public static void main(String[] args) {
        double days = 5.2;
        int hours = (int) (days * 24);
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("Количество дней " + days);
        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
