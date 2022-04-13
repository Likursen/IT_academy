package lesson3Homework.objects;

public class Book{
    private final String DEFAULT_AUTHOR_NAME = "Author name not set";
    private final String DEFAULT_AUTHOR_SURNAME = "Author surname not set";
    private final String DEFAULT_AUTHOR_PATRONYMIC = "Author patronymic not set";
    private final String DEFAULT_BOOK_NAME = "Book name not set";
    private final int DEFAULT_PUBLICATION_DATE = 0;

    private String authorName = DEFAULT_AUTHOR_NAME;
    private String authorSurname = DEFAULT_AUTHOR_SURNAME;
    private String authorPatronymic = DEFAULT_AUTHOR_PATRONYMIC;
    private String bookName = DEFAULT_BOOK_NAME;
    private int publicationDate = DEFAULT_PUBLICATION_DATE;

    public Book() {
    }

    public Book(String authorName,String authorSurname, String authorPatronymic, String bookName, int publicationDate) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.authorPatronymic = authorPatronymic;
        this.bookName = bookName;
        this.publicationDate = publicationDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (publicationDate != book.publicationDate) return false;
        if (!authorName.equals(book.authorName)) return false;
        if (!authorSurname.equals(book.authorSurname)) return false;
        if (!authorPatronymic.equals(book.authorPatronymic)) return false;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        int result = authorName.hashCode();
        result = 31 * result + authorSurname.hashCode();
        result = 31 * result + authorPatronymic.hashCode();
        result = 31 * result + bookName.hashCode();
        result = 31 * result + publicationDate;
        return result;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
