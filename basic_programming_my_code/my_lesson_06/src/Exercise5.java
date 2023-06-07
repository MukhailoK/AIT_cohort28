import java.util.Scanner;

public class Exercise5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void main(String[] args) {

        int ticket = getScanner().nextInt();
        checkTicket(ticket);
    }

    public static void checkTicket(int ticket) {
        if (String.valueOf(ticket).length() % 2 == 0) {
            if (isLucky(ticket)) {
                System.out.println("It is lucky");
            } else
                System.out.println("Not today");
        } else {
            System.out.println("your ticket is wrong");
        }
    }

    public static boolean isLucky(int ticket) {
        return sumFirst(ticket) == sumSecond(ticket);
    }

    public static int sumFirst(int ticket) {
        String s = String.valueOf(ticket);
        int result = 0;
        for (int i = 0; i <= s.length() / 2; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static int sumSecond(int ticket) {
        String s = String.valueOf(ticket);
        int result = 0;
        for (int i = s.length() / 2 - 1; i <= s.length() - 1; i++) {
            result += s.charAt(i);
        }
        return result;
    }
}