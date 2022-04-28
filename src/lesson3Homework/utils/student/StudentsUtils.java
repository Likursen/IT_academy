package lesson3Homework.utils.student;

import lesson3Homework.domain.Student;

import java.util.Random;
import java.util.TreeSet;

public class StudentsUtils {
    //method return TreeSet collection and adds given count of students with random parameters
    public static TreeSet<Student> studentsGeneration(int studentsCount) {
        TreeSet<Student> students = new TreeSet<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(getRandomStudent());
        }
        return students;
    }

    //method print info about given collection students
    public static void printStudentsInfo(TreeSet<Student> student) {
        System.out.print("List of all students");
        System.out.println(student + "\n");
    }

    //print students who have even ID number
    public static void printEvenIdStudentsInfo(TreeSet<Student> students) {
        System.out.print("Students with even ID number:");
        for (Student student : students) {
            if (student.getId() % 2 == 0) {
                System.out.print(student);
            }
        }
        System.out.println("\n");
    }

    //method remove students who have odd ID number
    public static void removeStudentsWithOddId(TreeSet<Student> students) {
        System.out.println("Removing students with odd ID\n");
        students.removeIf(student -> (student.getId() % 2 != 0));
    }

    //method return student with random parameters
    private static Student getRandomStudent() {
        return new Student(getRandomId(), getRandomAge());
    }

    //method return random ID the order
    private static int getRandomId() {
        int boundOfId = 999;
        return new Random().nextInt(boundOfId);
    }


    //method return random age ranging from minimum age to maximum age
    private static int getRandomAge() {
        int lowLimitAge = 16;
        int highLimitAge = 45;
        return new Random().nextInt(lowLimitAge, highLimitAge);
    }
}
