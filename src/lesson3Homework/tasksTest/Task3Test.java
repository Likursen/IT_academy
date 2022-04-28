package lesson3Homework.tasksTest;

import lesson3Homework.domain.Book;
import lesson3Homework.utils.book.BookUtils;
import lesson3Homework.utils.book.BooksFieldsForSorting;

import java.util.LinkedList;

public class Task3Test {
    public static void main(String[] args) {
        int countOfGeneratedBooks = 5;

        //create and print LinkedList collection with given count random book
        LinkedList<Book> books = BookUtils.bookGeneratorForTask1(countOfGeneratedBooks);
        BookUtils.printBookInfo(books);

        //sort list by name and print
        BookUtils.bookSorting(books, BooksFieldsForSorting.NAME);
        BookUtils.printBookInfo(books);

        //sort list by surname and print
        BookUtils.bookSorting(books, BooksFieldsForSorting.SURNAME);
        BookUtils.printBookInfo(books);

        //sort list by patronymic and print
        BookUtils.bookSorting(books, BooksFieldsForSorting.PATRONYMIC);
        BookUtils.printBookInfo(books);
    }
}
