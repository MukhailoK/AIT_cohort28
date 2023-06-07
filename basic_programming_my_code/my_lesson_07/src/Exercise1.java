import java.util.Scanner;

//Задача 1.
// Вводится n - натуральное число.
// Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод. При каком значении n происходит переполнение памяти,
// выделяемой для n типа int?
// Использовать цикл for.
public class Exercise1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("<< n! - Factorial(n) >>");
        System.out.println("Print down your N");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("N can`t be <1");
        } else if (n < 32) {
            System.out.println("Factorial " + n + " = " + factorial(n));
        } else
            System.out.println("Out of memory");
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i != n + 1; i++) {
            System.out.println(i);
            res *= i;
        }
        return res;
    }
}
