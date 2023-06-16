package ioshop;

//Задача 1
//
//Возьмите проект Computer из 19 урока.
// Добавьте поле barCode в класс Computer, и внесите соответствующие
// этому коррективы, включая переопределение метода equals.
// Создайте аппликацию "магазин компьютерной техники",
// по аналогии с аппликацией "библиотека", которую делали в классе.

import ioshop.model.Computer;
import ioshop.model.Laptop;
import ioshop.model.Smartphone;
import ioshop.model.Storage;


public class ComputerShopAppl {
    public static void main(String[] args) {
        Storage storage = new Storage(5);
        System.out.println(storage.getSize());
        storage.printAllArticles();

        storage.addArticle(new Computer("i5", 12, 512, "HP", 200));
        storage.addArticle(new Computer("i5", 12, 512, "HP", 200));
        storage.addArticle(new Computer("i5", 12, 512, "HP", 200));
        storage.addArticle(new Smartphone("MTK", 64, 512, "NoName", 300, 5, 0.320, 25444552214L));
        storage.addArticle(new Laptop("AMD", 64, 1024, "HP", 400, 36, 2.5));
        System.out.println(storage.getSize());
        storage.printAllArticles();

        Computer computer = storage.findComputer(300);
        System.out.println(computer);
        computer = storage.findComputer(400);
        System.out.println(computer);

        storage.removeComputer(400);

        System.out.println(storage.getSize());
        storage.printAllArticles();


    }

}
