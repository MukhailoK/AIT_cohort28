package wardrobe.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wardrobe.model.Wardrobe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class WardrobeTest {
    private static final int MAX = 5;
    private static final int SIZE = 10;
    static Random random = new Random();
    private Wardrobe[] wardrobes;

    @BeforeEach
    void setUp() {
        wardrobes = getWardrobes();
    }

    private Wardrobe[] getWardrobes() {
        Wardrobe[] wardrobes = new Wardrobe[SIZE];
        for (int i = 0; i < wardrobes.length; i++) {
            double height = 1 + random.nextInt(MAX);
            double width = 1 + random.nextInt(MAX);
            double depth = 1 + random.nextInt(MAX);
            wardrobes[i] = new Wardrobe(height
                    , width
                    , depth);
        }
        return wardrobes;
    }

    @Test
    void testAreaComparatorWardrobe() {
        printArray(wardrobes, "Area Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.getArea(), w2.getArea());
        Arrays.sort(wardrobes, comparator);
        printArray(wardrobes, "Area Comparator after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1), comparator);
        System.out.println("index = " + index);
    }

    @Test
    void testVolumeComparatorWardrobe() {
        printArray(wardrobes, "Volume Comparator before sort");
        Arrays.sort(wardrobes, (w1, w2) -> Double.compare(w1.getVolume(), w2.getVolume()));
        printArray(wardrobes, "Volume Comparator after sort");
    }

    @Test
    void testAreaAndVolumeComparatorWardrobe() {
        printArray(wardrobes, "Area and Volume Comparator before sort");
        Arrays.sort(wardrobes, (w1, w2) -> {
            int res = Double.compare(w1.getArea(), w2.getArea());
            return res != 0 ? res
                    : Double.compare(w1.getVolume(), w2.getVolume());
        });
        printArray(wardrobes, "Area and Volume Comparator after sort");
    }

    @Test
    void testComparableWardrobe() {
        printArray(wardrobes, "Test Comparable before sort");
        Arrays.sort(wardrobes);
        printArray(wardrobes, "Test Comparable after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2, 4, 1));
        System.out.println("index = " + index);
    }

    private void printArray(Wardrobe[] wardrobes, String title) {
        System.out.println("====" + title + "====");
        for (Wardrobe w : wardrobes) {
            System.out.println(w);
        }
    }
}