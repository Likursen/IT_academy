/*Пройти циклом по числам от 1 до 12 и вывести название месяца,
соответствующее каждому числу (используя цикл и оператор if else)*/
package lesson1Homework;

public class Task8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1 -> System.out.println("Январь");
                case 2 -> System.out.println("Февраль");
                case 3 -> System.out.println("Март");
                case 4 -> System.out.println("Апрель");
                case 5 -> System.out.println("Май");
                case 6 -> System.out.println("Июнь");
                case 7 -> System.out.println("Июль");
                case 8 -> System.out.println("Август");
                case 9 -> System.out.println("Сентбрь");
                case 10 -> System.out.println("Октябрь");
                case 11 -> System.out.println("Ноябрь");
                case 12 -> System.out.println("Декабрь");
                default -> System.out.println("нет такого месяца");
            }
        }
    }
}