import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Time {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.getMonth());
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDate gagarin = LocalDate.of(1961, Month.APRIL, 12);
        System.out.println(gagarin.isAfter(currentDate));
    }
}
