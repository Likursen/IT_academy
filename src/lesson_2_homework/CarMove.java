package lesson_2_homework;

public interface CarMove {
    void turn(Car[] carArrays, int number, String vector);
    void move(Car[] carArrays, int number, int speed);
}
