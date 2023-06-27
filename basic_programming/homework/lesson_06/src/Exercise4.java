import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        System.out.println(reverse(numb));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return Integer.parseInt(result);
    }
}