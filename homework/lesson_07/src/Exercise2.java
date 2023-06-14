import java.util.Scanner;

//Задача 2. В сберкассу на трёхпроцентный вклад положили S рублей.
// Какой станет сумма вклада через N лет. Использовать цикл for.
public class Exercise2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("<< Deposit >>");

        System.out.println("Print down how much money do you set");
        double money = scanner.nextDouble();

        System.out.println("Print down how much years do u want save money on a deposit amount");
        int years = scanner.nextInt();

        System.out.println("After " + years + " year(s) on your amount will "
                + calcDep(money, years) + " money");

    }

    public static double calcDep(double money, int years) {
        double d = money;
        for (int i = 0; i < years; i++) {
            d += d * .3;
        }
        return d;
    }
}