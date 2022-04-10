package lesson3Homework;

import lesson3Homework.objects.Book;
import lesson3Homework.utils.BookUtils;

import java.util.HashSet;

public class Starter {
    public static void main(String[] args) {
//        LinkedList<Book> booksForTask1 = BookUtils.BookGeneratorForTask1(20);
//        BookUtils.printBookInfo(booksForTask1);
//        books.remove(6);
//        BookUtils.printBookInfo(booksForTask1);

        HashSet<Book> booksForTask2 = BookUtils.BookGeneratorForTask2(25, 6);
        BookUtils.printBookInfo(booksForTask2);
        BookUtils.printStartsWithAVowel(booksForTask2);


    }
}
