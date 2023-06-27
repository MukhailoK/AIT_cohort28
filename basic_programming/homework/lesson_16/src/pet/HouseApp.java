package pet;

import pet.model.Cat;
import pet.model.Dog;

public class HouseApp {
    public static void main(String[] args) {
        Dog dog1 = (new Dog("type", 5.5, false, "Rex", "dvorova", 4));
        Dog dog2 = (new Dog("type", 2.5, true, "Green", "Taxa", 2));
        Cat cat1 = (new Cat("type", 1.5, false, "Barsik", "unknow", 12));
        Cat cat2 = (new Cat("type", 1.5, false, "Luis", "unknow", 12));
        Cat cat3 = new Cat("type", 1.5, true, "Marsik", "unknow", 12);
        dog1.run();
        dog2.eat();
        cat1.sleep();
        cat2.voice();
        cat3.eat();
        dog2.voice();
        dog1.sleep();
    }
}
