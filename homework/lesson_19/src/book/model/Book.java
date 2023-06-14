package book.model;

public class Book {
    public static final int ISBN_LENGTH = 13;
    private final String name;
    private final String author;
    private final int yearOfPrinting;
    private final String iSBN;

    public Book(String name, int yearOfPrinting) {
        this.name = name;
        this.author = "Unknown";
        this.yearOfPrinting = yearOfPrinting;
        this.iSBN = "-1";
    }

    public Book(String name, String author, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.yearOfPrinting = yearOfPrinting;
        this.iSBN = "-1";
    }

    public Book(String name, String author, String iSBN, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.iSBN = checkCorrect(iSBN);
        this.yearOfPrinting = yearOfPrinting;
    }

    private static String checkCorrect(String iSBN) {
        if (iSBN != null && iSBN.length() != 0) {
            String isbn = iSBN.replaceAll("-", "");
            if (isbn.length() == ISBN_LENGTH) {
                return iSBN;
            }
        }
        return "-1";

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
                ", iSBN='" + iSBN + '\'' +
                ", yearOfPrinting=" + yearOfPrinting +
                '}';
    }

    public String getISBN() {
        return iSBN;
    }

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

}
