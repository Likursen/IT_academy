package lesson3Homework.utils.studentUtils;

import lesson3Homework.domain.Student;

import java.util.Random;
import java.util.TreeSet;

public class StudentsUtils {
    public static TreeSet<Student> studentsGeneration(int studentsCount) {
        //method return TreeSet collection and adds given count of students with random parameters
        TreeSet<Student> students = new TreeSet<>();
        for (int i = 0; i < studentsCount; i++) {
            students.add(getRandomStudent());
        }
        return students;
    }

    public static void printStudentsInfo(TreeSet<Student> student) {
        //method print info about given collection students
        System.out.print("List of all students");
        System.out.println(student + "\n");
    }

    public static void printEvenIdStudentsInfo(TreeSet<Student> students) {
        //print students who have even ID number
        System.out.print("Students with even ID number:");
        for (Student student : students) {
            if (student.getId() % 2 == 0) {
                System.out.print(student);
            }
        }
        System.out.println("\n");
    }

    public static void removeStudentsWithOddId(TreeSet<Student> students) {
        //method remove students who have odd ID number
        System.out.println("Removing students with odd ID\n");
        students.removeIf(student -> (student.getId() % 2 != 0));
    }

    private static Student getRandomStudent() {
        //method return student with random parameters
        return new Student(getRandomId(), getRandomAge());
    }

    private static int getRandomId() {
        //method return random ID the order
        int boundOfId = 999;
        return new Random().nextInt(boundOfId);
    }


    private static int getRandomAge() {
        //method return random age ranging from minimum age to maximum age
        int lowLimitAge = 16;
        int highLimitAge = 45;
        return new Random().nextInt(lowLimitAge, highLimitAge);
    }
}
