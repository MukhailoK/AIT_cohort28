package book;


import book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new Book("Clear code",
                "Robert C. Martin",
                "978-617-09-5285-1",
                2022));
        library.add(new Book("Kolobok", "Kazky"));
        library.add(new Book("Clear coder", "Robert C. Martin", 2022));

        printList(library);
    }

    public static void printList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
