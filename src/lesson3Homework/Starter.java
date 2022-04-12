package lesson3Homework;

import lesson3Homework.objects.Book;
import lesson3Homework.utils.BookUtils;
import lesson3Homework.utils.BooksFieldsForSorting;

import java.util.HashSet;
import java.util.LinkedList;

public class Starter {
    public static void main(String[] args) {
        LinkedList<Book> booksForTask1 = BookUtils.bookGeneratorForTask1(5);
        BookUtils.printBookInfo(booksForTask1);
//        booksForTask1.remove(6);
//        BookUtils.printBookInfo(booksForTask1);

//        HashSet<Book> booksForTask2 = BookUtils.bookGeneratorForTask2(25, 6);
//        BookUtils.printBookInfo(booksForTask2);
//        BookUtils.printStartsWithAVowel(booksForTask2);

        BookUtils.bookSorting(booksForTask1, BooksFieldsForSorting.PATRONYMIC);
        BookUtils.printBookInfo(booksForTask1);
    }
}
