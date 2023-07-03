import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            int day1 = Integer.parseInt(s1.substring(0, 2));
            int month1 = Integer.parseInt(s1.substring(3, 5));
            int year1 = Integer.parseInt(s1.substring(6, 10));
            int day2 = Integer.parseInt(s2.substring(0, 2));
            int month2 = Integer.parseInt(s2.substring(3, 5));
            int year2 = Integer.parseInt(s2.substring(6, 10));

            if (year1 > year2) {
                return 1;
            } else if (year1 < year2) {
                return -1;
            } else {
                if (month1 > month2) {
                    return 1;
                } else if (month1 < month2) {
                    return -1;
                } else {
                    if (day1 > day2) {
                        return 1;
                    } else if (day1 < day2) {
                        return -1;
                    }
                    return 0;
                }
            }
        }
        ;
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        Arrays.sort(dates, dateComparator);
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        assertArrayEquals(expected, dates);
    }
}
