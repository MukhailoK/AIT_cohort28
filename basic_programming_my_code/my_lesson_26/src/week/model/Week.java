package week.model;

import java.util.Arrays;

public class Week {

    static String[] daysOfWeek = new String[7];

    public static void main(String[] args) {
        String[] d = getDaysOfWeek();
        System.out.println(Arrays.toString(d));
        getWorkDaysFromSunday(d);
        System.out.println(Arrays.toString(d));
    }

    public static String[] getDaysOfWeek() {
        return daysOfWeek = new String[]{String.valueOf(Days.MONDAY),
                String.valueOf(Days.TUESDAY),
                String.valueOf(Days.WEDNESDAY),
                String.valueOf(Days.THURSDAY),
                String.valueOf(Days.FRIDAY),
                String.valueOf(Days.SATURDAY),
                String.valueOf(Days.SUNDAY),
        };
    }

    public static void getWorkDaysFromSunday(String[] daysOfWeek) {
        String s = daysOfWeek[daysOfWeek.length - 1];
        for (int i = daysOfWeek.length - 1; i > 0; i--) {
            daysOfWeek[i] = daysOfWeek[i - 1];
        }
        daysOfWeek[0] = s;
    }
}