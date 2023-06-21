package book;
//Задача 1
//
//Создать класс Book в пакете ait.book.ait.user.model.
// В этом классе определить поля: private long isbn;
// private String title; private String author; private int yearOfPublishing;
// Создать конструкторы для иницализации всех полей, и конструктор для инициализации полуй при отсутствии автора.
// Остальные конструкторы на Ваше усмотрение. Создать геттеры и сеттеры исходя из логики и необходимости.
// Создать метод public void display() для печати в консоль информации о книге.
// Создать класс BookAppl в пакете ait.book с методом main.
// В методе main создать несколько экземпляров Book и вывести для каждого из них результат работы метода display.

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
        library.add(new Book("Kolobok", 2003));
        library.add(new Book("Clear coder", "Robert C. Martin", 2022));

        printList(library);
    }

    public static void printList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
