package lesson3Homework.tasksTest;

import lesson3Homework.domain.Book;
import lesson3Homework.utils.book.BookUtils;

import java.util.HashSet;

public class Task2Test {
    public static void main(String[] args) {
        int countOfGeneratedBooks = 25;
        int repeatedBooks = 6;

        //create and print HashSet books collection with given count random book, given count of them are repeated
        HashSet<Book> books = BookUtils.bookGeneratorForTask2(countOfGeneratedBooks, repeatedBooks);
        BookUtils.printBookInfo(books);

        //print books from given collection, who title starts with a vowel
        BookUtils.printBookWhoTitleStartsAVowel(books);
    }
}
