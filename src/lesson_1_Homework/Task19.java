/*Напишите программу, которая будет считать количество
часов, минут и секунд в n-ном количестве суток.*/
package lesson_1_Homework;

public class Task19 {
    public static void main(String[] args) {
        int days = 1;
        int hoursInDay = 24;
        int minutesInDay = 1440;
        int secondsInDay = 86400;
        int hours = days * hoursInDay;
        int minutes = days * minutesInDay;
        int seconds = days * secondsInDay;
        System.out.println("Количество дней " + days);
        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд");
    }
}
