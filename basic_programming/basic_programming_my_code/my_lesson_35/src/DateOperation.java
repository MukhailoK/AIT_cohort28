import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperation {

    public static int getAge(String s) {
        return LocalDate.now().getYear() - parseString(s).getYear();
    }

    public static String[] sortStringDates(String[] dates) {
        Arrays.sort(dates, Comparator.comparing(DateOperation::parseString));
        return dates;
    }

    private static LocalDate parseString(String s) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (s.contains("-")) {
            df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        }
        return LocalDate.parse(s, df);
    }
}
