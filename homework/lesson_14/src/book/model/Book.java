package book.model;

public class Book {
    private String name;
    private String author;
    private String iSBN;
    private int yearOfPrinting;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int yearOfPrinting) {
        this.name = name;
        this.author = author;
        this.yearOfPrinting = yearOfPrinting;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

    public void setYearOfPrinting(int yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }
}
