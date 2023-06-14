package computer;

import ait.computer.model.Computer;
import ait.computer.model.Laptop;
import ait.computer.model.Smartphone;

public class IoShopApp {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple M2", 16, 1024, "Apple", 13, 2.5);
        Computer computer = new Computer("AMD Ryzen 9 4th Gen", 32, 2048, "Asus");
        Smartphone smartphone = new Smartphone("SnepDragon", 6, 512, "Samsung", 62, 0.235, 255444778);
        System.out.println(laptop);
        System.out.println(computer);
        System.out.println(smartphone);
    }
}
