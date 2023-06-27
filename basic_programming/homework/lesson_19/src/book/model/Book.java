package book.model;

public class Book {
    public static final int ISBN_LENGTH = 13;
    private final String name;
    private final String author;
    private final int yearOfPrinting;
    private final long isbn;

    public Book(String name, int yearOfPrinting) {
        this.name = name;
        this.author = "Unknown";
        this.yearOfPrinting = yearOfPrinting;
        this.isbn = -1;
    }

    public Book(String name, String author, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.yearOfPrinting = yearOfPrinting;
        this.isbn = -1;
    }

    public Book(String name, String author, long isbn, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.isbn = checkCorrect(isbn);
        this.yearOfPrinting = yearOfPrinting;
    }

    private static long checkCorrect(long isbn_) {
        if (isbn_ != 0) {
            String isbn = String.valueOf(isbn_);
            if (isbn.length() == ISBN_LENGTH) {
                return isbn_;
            }
        }
        return -1;

    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", iSBN='" + isbn + '\'' +
                ", yearOfPrinting=" + yearOfPrinting +
                '}';
    }

    public long getISBN() {
        return isbn;
    }

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

}
