package lesson3Homework;

import lesson3Homework.objects.User;
import lesson3Homework.utils.UserUtils;

import java.util.List;

public class Starter {
    public static void main(String[] args) {
//        LinkedList<Book> booksForTask1 = BookUtils.bookGeneratorForTask1(5);
//        BookUtils.printBookInfo(booksForTask1);
//        booksForTask1.remove(6);
//        BookUtils.printBookInfo(booksForTask1);


//        HashSet<Book> booksForTask2 = BookUtils.bookGeneratorForTask2(25, 6);
//        BookUtils.printBookInfo(booksForTask2);
//        BookUtils.printStartsWithAVowel(booksForTask2);


//        LinkedList<Book> booksForTask1 = BookUtils.bookGeneratorForTask1(5);
//        BookUtils.printBookInfo(booksForTask1);
//        BookUtils.bookSorting(booksForTask1, BooksFieldsForSorting.PATRONYMIC);
//        BookUtils.printBookInfo(booksForTask1);

//        TreeSet <Student> students = StudentsUtils.studentsGeneration(10);
//        StudentsUtils.printStudentsInfo(students);
//        StudentsUtils.printEvenIdStudentsInfo(students);
//        StudentsUtils.deleteOddIdStudent(students);
//        StudentsUtils.printStudentsInfo(students);

//        List<User> users = UserUtils.userGenerator(2);
//        System.out.println(users);
        User dima = UserUtils.getRandomUser();
        System.out.println(dima);
        UserUtils.setUserFriends(dima, 2);
    }
}
