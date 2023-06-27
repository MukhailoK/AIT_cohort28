package book.model;

public class Book {
    private final String name;
    private final String author;
    private final int yearOfPrinting;
    private String iSBN;

    public Book(String name, int yearOfPrinting) {
        this.name = name;
        this.author = "Unknown";
        this.yearOfPrinting = yearOfPrinting;
        this.iSBN = "Unknown";
    }

    public Book(String name, String author, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.yearOfPrinting = yearOfPrinting;
        this.iSBN = "Unknown";
    }

    public Book(String name, String author, String iSBN, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.iSBN = iSBN;
        this.yearOfPrinting = yearOfPrinting;
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

    public void setISBN(String ISBN) {
        this.iSBN = ISBN;
    }

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

}
