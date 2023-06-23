package dublicat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {

    Dublicats sumOdd;

    @BeforeEach
    void setUp() {
        sumOdd = new Dublicats();
    }

    @Test
    void checkSimple() {
        int[] arr = {-2, 3, 4, -5, 2, -2, 6, 8, -8, 5};
         int simple = 9;
        int res = sumOdd.getSumOfOdd(arr);
        assertEquals(simple, res);
    }

    @Test
    void checkDublicate(){
        int[] arr = {-2, 3, 4, -5, 2, -2, 6, 8, -8, 5};
        assertTrue(sumOdd.isDublicatPresent(arr));
    }
    @Test
    void checkNoDublicate(){
        int[] arr = {-2, 3, 4, -5, 2, 6, 8, -8, 5};
        assertFalse(sumOdd.isDublicatPresent(arr));
    }
}