//Задача 0. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n.
// n вводится с клавиатуры. Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10
// Использовать цикл for.

import java.util.Scanner;

public class Exercise0 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sum from 1 to 1/n");
        System.out.println("print your digit (n)");
        int n = scanner.nextInt();
        System.out.println(meth(n));
    }

    public static double meth(int n) {
        double res = 0;
        for (double i = 1; i != n+1; i++) {
            res += 1 / i;
        }
        return res;
    }
}