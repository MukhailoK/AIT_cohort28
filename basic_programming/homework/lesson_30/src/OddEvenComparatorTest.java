import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OddEvenComparatorTest {
    private final OddEvenComparator oddEvenComparator;

    public OddEvenComparatorTest() {
        this.oddEvenComparator = new OddEvenComparator();
    }

    @Test
    void compare() {
        Integer[] origin = {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 9, 7, 5, 3, 3, 1};
        oddEvenComparator.printArray(origin);
        Arrays.sort(origin, new OddEvenComparator());
        assertArrayEquals(expected, origin);
        System.out.println();
        oddEvenComparator.printArray(origin);
    }
}
