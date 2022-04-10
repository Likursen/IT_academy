package lesson3Homework.utils;

import lesson3Homework.objects.Book;

import java.util.*;

public class BookUtils {
    public static LinkedList<Book> BookGeneratorForTask1(int bookCount) {
        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < bookCount; i++) {
            books.add(getRandomBook());
        }
        return books;
    }

    public static HashSet<Book> BookGeneratorForTask2(int bookCount, int countRepeatedBook) {
        Book repeatedBook = getRandomBook();
        HashSet<Book> books = new HashSet<>();
        for (int i = 0; i < bookCount; i++) {
            if (i < countRepeatedBook) {
                books.add(repeatedBook);
            } else {
                books.add(getRandomBook());
            }
        }
        return books;
    }


    public static Book getRandomBook() {
        return new Book(getRandomAuthorName(), getRandomAuthorSurname(), getaRandomAuthorPatronymic(), getRandomBookName(), getRandomPublicationDate());
    }

    public static void printBookInfo(Collection<Book> books) {
        System.out.println(books);
    }

    public static void printStartsWithAVowel(Collection<Book> books) {
        String vowel = "AaEeYyUuIiOo";
        ArrayList<Book> booksInList = new ArrayList<>(books);
        for (int i = 0; i < booksInList.size(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (firstSymbolOfWord(booksInList, i) == vowel.charAt(j)) {
                    System.out.print(booksInList.get(i));
                }
            }
        }
    }

    private static char firstSymbolOfWord(ArrayList<Book> books, int i) {
        return books.get(i).getBookName().charAt(0);
    }

    private static int getRandomPublicationDate() {
        return new Random().nextInt(1400, 2022);
    }

    private static String getRandomAuthorName() {
        return getRandomString();
    }

    private static String getRandomAuthorSurname() {
        return getRandomString();
    }

    private static String getaRandomAuthorPatronymic() {
        return getRandomString();
    }

    private static String getRandomBookName() {
        return getRandomString();
    }

    private static String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}