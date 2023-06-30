package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CatTest {
    Cat[] cats;

    @BeforeEach
    void setUp() {
        cats = new Cat[4];
        cats[0] = new Cat("Cat3", 12, "white", 3);
        cats[1] = new Cat("Cat2", 2, "black", 1);
        cats[2] = new Cat("Cat4", 7, "ginger", 4);
        cats[3] = new Cat("Cat1", 8, "grey", 2);
    }

    @Test
    void compareByAge() {
        System.out.println("==========Test 1=================");
        Cat[] expend = {cats[1], cats[3], cats[0], cats[2]};
        Arrays
                .sort(cats, Cat::compareTo);
        assertArrayEquals(cats, expend);
        printArray(cats);
    }

    @Test
    void compareByName() {
        System.out.println("==========Test 2=================");
        Cat[] expend = {cats[3], cats[1], cats[0], cats[2]};
        Comparator<Cat> catComparator =
                Comparator
                        .comparing(Cat::getName);
        Arrays.sort(cats, catComparator);
        assertArrayEquals(cats, expend);
        printArray(cats);
    }

    @Test
    void compareByAgeAndWight() {
        System.out.println("==========Test 3=================");
        Cat[] expend = {cats[1], cats[2], cats[3], cats[0]};
        Comparator<Cat> catComparator =
                Comparator
                        .comparingInt(Cat::getWeight)
                        .thenComparingInt(Cat::getAge);
        Arrays.sort(cats, catComparator);
        printArray(cats);
        assertArrayEquals(cats, expend);
    }


    private void printArray(Cat[] cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
    }
}