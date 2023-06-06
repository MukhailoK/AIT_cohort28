import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = daysOfTrain(scanner.nextInt(), scanner.nextInt());
        System.out.println("on " + res + " day");
    }


    public static int daysOfTrain(double km, double target) {
        int count = 1;
        for (; km < target; km += km * .1) {
            count++;
        }
        return count;
    }
}
