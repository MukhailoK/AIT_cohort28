import java.util.Scanner;

//Задача 5. ()*
// Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
// Через сколько лет его долг превысит s тысяч рублей, если за
// это время он не будет отдавать долг.
public class Exercise5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("$ calc of debt $");

        System.out.println("print down sum of credit");
        double credit = scanner.nextDouble();

        System.out.println("print down sum of debt");
        double debt = scanner.nextInt();

        System.out.println("your debt after " + years(credit, debt) + " years will more " + debt);
    }

    public static int years(double credit, double debt) {
        int years = 0;
        for (; credit < debt; credit += credit * .1) {
            years++;
        }
        return years;
    }
}