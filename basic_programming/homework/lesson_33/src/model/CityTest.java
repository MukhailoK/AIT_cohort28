package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    @Test
    void compareCities() {
        printAll(cities, "Original Array");
        Arrays.sort(cities);
        printAll(cities, "Natural order");
        City pattern = new City("Dallas", 1_300_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("index = " + index);
        System.out.println(cities[index]);
        assertEquals(pattern, cities[index]);
    }

    @Test
    void comparator() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printAll(cities, "Sorted by name");
        City pattern = new City("Chicago", 0);
        int ind = Arrays.binarySearch(cities, pattern, comparator);
        System.out.println("Index = " + ind);
        assertEquals(pattern.getName(), cities[ind].getName());
    }

    @Test
    void testArrayCopy() {

        City[] citiesCopy = new City[cities.length]; //1
        System.arraycopy(cities, 0, citiesCopy, 0, citiesCopy.length); //1
        printAll(citiesCopy, "Cities copy");
        citiesCopy = Arrays.copyOf(cities, cities.length); //or 2
        printAll(citiesCopy, "Cities copy");
        citiesCopy = Arrays.copyOfRange(citiesCopy, 1, cities.length - 1);
        Arrays.sort(cities);
        printAll(citiesCopy, "Cities copy of range");

    }

    private void printAll(Object[] arr, String tittle) {
        System.out.println("======" + tittle + "======");
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}