package lesson3Homework.tasksTest;

import lesson3Homework.domain.Book;
import lesson3Homework.utils.book.BookUtils;

import java.util.LinkedList;

public class Task1Test {
    public static void main(String[] args) {
        int countOfGeneratedBooks = 9;
        int indexOfRemovedBook = 6;

        //create and print LinkedList books collection with given count random book
        LinkedList<Book> books = BookUtils.bookGeneratorForTask1(countOfGeneratedBooks);
        BookUtils.printBookInfo(books);

        //remove book with given index and print books collection after removing
        books.remove(indexOfRemovedBook);
        BookUtils.printBookInfo(books);
    }
}