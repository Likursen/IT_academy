package lesson3Homework.utils;

import lesson3Homework.objects.Book;

import java.util.*;

public class BookUtils {
    public static LinkedList<Book> bookGeneratorForTask1(int bookCount) {
        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < bookCount; i++) {
            books.add(getRandomBook());
        }
        return books;
    }

    public static HashSet<Book> bookGeneratorForTask2(int bookCount, int countRepeatedBook) {
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

    public static void bookSorting(List<Book> books, BooksFieldsForSorting type) {
        switch (type) {
            case NAME:
                Collections.sort(books, new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorName().compareTo(o2.getAuthorName());
                    }
                });
                break;

            case SURNAME:
                Collections.sort(books, new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorSurname().compareTo(o2.getAuthorSurname());
                    }
                });
                break;

            case PATRONYMIC:
                Collections.sort(books, new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
                    }
                });
                break;
        }
    }

    public static Book getRandomBook() {
        return new Book(getRandomAuthorName(), getRandomAuthorSurname(), getaRandomAuthorPatronymic(), getRandomBookName(), getRandomPublicationDate());
    }

    public static void printBookInfo(Collection<Book> books) {
        System.out.println(books);
    }

    public static void printStartsWithAVowel(Collection<Book> books) {
        String vowel = "AaEeYyUuIiOo";
        char[] vowelChars = vowel.toCharArray();
        ArrayList<Book> booksInList = new ArrayList<>(books);
        for (Book book : booksInList) {
            for (char aChar : vowelChars) {
                if (firstSymbolOfBookName(book) == aChar) {
                    System.out.print(book);
                }
            }
        }
    }

    private static char firstSymbolOfBookName(Book books) {
        return books.getBookName().charAt(0);
    }

    private static int getRandomPublicationDate() {
        return new Random().nextInt(1400, 2022);
    }

    private static String getRandomAuthorName() {
        return getRandomString(7);
    }

    private static String getRandomAuthorSurname() {
        return getRandomString(8);
    }

    private static String getaRandomAuthorPatronymic() {
        return getRandomString(5);
    }

    private static String getRandomBookName() {
        return getRandomString(4);
    }

    private static String getRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}