package lesson3Homework.utils.bookUtils;

import lesson3Homework.domain.Book;

import java.util.*;

public class BookUtils {
    public static LinkedList<Book> bookGeneratorForTask1(int bookCount) {
        //method return LinkedList collection of random book with given size
        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < bookCount; i++) {
            books.add(getRandomBook());
        }
        return books;
    }

    public static HashSet<Book> bookGeneratorForTask2(int bookCount, int countRepeatedBook) {
        //method return HashSet collection of random book with given size and count of repeated books
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
        //method return book collection after sorting by given fields
        System.out.println("\nSorted by " + type);
        switch (type) {
            case NAME:
                //sorting collection by name
                books.sort(new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorName().compareTo(o2.getAuthorName());
                    }
                });
                break;

            case SURNAME:
                //sorting collection by surname
                books.sort(new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorSurname().compareTo(o2.getAuthorSurname());
                    }
                });
                break;

            case PATRONYMIC:
                //sorting collection by patronymic
                books.sort(new Comparator<>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
                    }
                });
                break;
        }
    }

    public static Book getRandomBook() {
        //method generate book with random parameters
        return new Book(getRandomAuthorName(), getRandomAuthorSurname(), getaRandomAuthorPatronymic(), getRandomBookTitle(), getRandomPublicationDate());
    }

    public static void printBookInfo(Collection<Book> books) {
        //method print info about given collection books
        System.out.println(books);
    }

    public static void printBookWhoTitleStartsAVowel(Collection<Book> books) {
        //method print books from given collection, who title starts with a vowel
        String vowel = "AaEeYyUuIiOo";//list of all vowel chars
        char[] vowelChars = vowel.toCharArray();
        ArrayList<Book> booksInList = new ArrayList<>(books);
        for (Book book : booksInList) {
            for (char aChar : vowelChars) {
                if (firstSymbolOfBookTitle(book) == aChar) {
                    System.out.print(book);
                }
            }
        }
    }

    private static char firstSymbolOfBookTitle(Book books) {
        //method return first Symbol of given book title
        return books.getBookTitle().charAt(0);
    }

    private static int getRandomPublicationDate() {
        //method return random year ranging from minimum year to maximum year
        int minLimitYear = 1400;
        int maxLimitYear = 2022;
        return new Random().nextInt(minLimitYear, maxLimitYear);
    }

    private static String getRandomAuthorName() {
        //method return random string with default author name length
        int defaultAuthorNameLength = 7;
        return getRandomString(defaultAuthorNameLength);
    }

    private static String getRandomAuthorSurname() {
        //method return random string with default author surname length
        int defaultAuthorSurnameLength = 8;
        return getRandomString(defaultAuthorSurnameLength);
    }

    private static String getaRandomAuthorPatronymic() {
        //method return random string with default author patronymic length
        int defaultAuthorPatronymicLength = 5;
        return getRandomString(defaultAuthorPatronymicLength);
    }

    private static String getRandomBookTitle() {
        //method return random string with default book title length
        int defaultBookTitleLength = 4;
        return getRandomString(defaultBookTitleLength);
    }

    private static String getRandomString(int targetStringLength) {
        //method return random lower case string with given length
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