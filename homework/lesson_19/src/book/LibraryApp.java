package book;
//Задача 1
//
//Возьмите проект Book из домашнего задания к 15 уроку.
// Поле isbn сделайте final.
// Добавьте константу public static final int ISBN_LENGTH = 13.
// В конструкторе, при инициализации isbn сделайте проверку аргумента на
// колличество цифр в числе. Оно должно быть равно ISBN_LENGTH.
// Если не равно, то инициализируйте isbn значением -1.
// Для подсчета колличества цифр в числе,
// используйте алгоритм реализованный нами в предыдущих уроках.
import book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        library.add(new Book("Clear code",
                "Robert C. Martin",
                978_617_09_5285_1L,
                2022));
        library.add(new Book("Kolobok", 2003));
        library.add(new Book("Clear coder", "Robert C. Martin", 2022));
        library.add(new Book("Clear code",
                "Robert C. Martin",
                978_617_09_5285L,
                2022));
        library.add(new Book("Clear code",
                "Robert C. Martin",
                978_617_09_52385_1L,
                2022));
        library.add(new Book("Kolobok"
                ,"Volk"
                , 111_558_89_6552_3L
                , 2003));
        library.add(new Book("Clear code",
                "Robert C. Martin",
                12221L,
                2022));
        printList(library);
    }

    public static void printList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
