public class MonthApp {
    public static void main(String[] args) {
        Month month = Month.DEC;
        System.out.println(month);
        System.out.println(month.plusMonth(1));
        System.out.println(Month.getName(13));
    }

}
