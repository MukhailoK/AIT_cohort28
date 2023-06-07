import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        sum(n, sum);
    }

    public static void sum(int n, int sum) {
        if (n != 0) {
            sum += n % 10;
            sum(n / 10, sum);
        } else System.out.println(sum);
    }
}