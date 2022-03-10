/*Пройти циклом по числам от 1 до 12 и вывести название месяца,
соответствующее каждому числу (используя цикл и оператор if else)*/
package lesson1;

public class Task8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println("Январь");
            } else if (i == 2) {
                System.out.println("Февраль");
            } else if (i == 3) {
                System.out.println("Март");
            } else if (i == 4) {
                System.out.println("Апрель");
            } else if (i == 5) {
                System.out.println("Май");
            } else if (i == 6) {
                System.out.println("Июнь");
            } else if (i == 7) {
                System.out.println("Июль");
            } else if (i == 8) {
                System.out.println("Август");
            } else if (i == 9) {
                System.out.println("Сентбрь");
            } else if (i == 10) {
                System.out.println("Октябрь");
            } else if (i == 11) {
                System.out.println("Ноябрь");
            } else {
                System.out.println("Декабрь");
            }
        }
    }
}
