import java.util.Scanner;

public class Exercise1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("print down your string");
        replacer(scanner.nextLine(), scanner.nextInt());
    }

    public static void replacer(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
