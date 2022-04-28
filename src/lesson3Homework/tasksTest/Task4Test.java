package lesson3Homework.tasksTest;

import lesson3Homework.domain.Student;
import lesson3Homework.utils.student.StudentsUtils;

import java.util.TreeSet;

public class Task4Test {
    public static void main(String[] args) {
        int countOfGeneratedStudents = 10;
        //create and print TreeSet collection with given count random students
        TreeSet<Student> students = StudentsUtils.studentsGeneration(countOfGeneratedStudents);
        StudentsUtils.printStudentsInfo(students);

        //print students who have even ID number (without removing)
        StudentsUtils.printEvenIdStudentsInfo(students);

        //removing students who have odd ID number and print students list
        StudentsUtils.removeStudentsWithOddId(students);
        StudentsUtils.printStudentsInfo(students);
    }
}
