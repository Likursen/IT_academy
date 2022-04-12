package lesson3Homework.utils;

import lesson3Homework.objects.Student;

import java.util.Random;
import java.util.TreeSet;

public class StudentsUtils {
    public static TreeSet<Student> studentsGeneration(int studentsCount) {
        TreeSet<Student> students = new TreeSet<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(getRandomStudent());
        }
        return students;
    }

    public static void printStudentsInfo(TreeSet<Student> student) {
        System.out.print("\nList of all students");
        System.out.println(student);
    }

    public static void printEvenIdStudentsInfo(TreeSet<Student> students) {
        System.out.print("\nStudents with even ID number:");
        for (Student student : students) {
            if (getStudentId(student) % 2 == 0) {
                System.out.print(student);
            }
        }
    }

    public static void deleteOddIdStudent(TreeSet<Student> students) {
        students.removeIf(student -> (student.getId() % 2 != 0));
    }

    private static int getStudentId(Student student) {
        return student.getId();
    }

    private static int getRandomId() {
        int boundOfId = 999;
        return new Random().nextInt(boundOfId);
    }

    private static int getRandomAge() {
        int lowLimitAge = 16;
        int highLimitAge = 45;
        return new Random().nextInt(lowLimitAge, highLimitAge);
    }

    private static Student getRandomStudent() {
        return new Student(getRandomId(), getRandomAge());
    }
}
