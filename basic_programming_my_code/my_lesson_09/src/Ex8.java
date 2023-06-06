/**
 * The class generates an array of random bank account balances, performs a currency denomination, and prints the updated
 * balances.
 */
//Имеется массив данных - остатки на счетах клиентов банка (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
// количество клиентских счетов = 20). Произошла деноминация, теперь 1 д.е = 100 старых д.е. Рассчитайте новые остатки денег на счетах клиентов.
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("$Denomination$ \n");
        double[] amounts = randomAmounts(20);
        System.out.println("Amounts before denomination \n");
        printArray(amounts);
        System.out.println("\nAmounts after denomination \n");
        printArray(denomination(amounts));
    }

    public static double[] randomAmounts(int size) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * (100_000_000 - 10_000 + 1) + 10_000);
        }
        return array;
    }

    /**
     * The function converts an array of amounts in cents to an array of amounts in dollars.
     *
     * @param amounts an array of doubles representing monetary amounts in cents.
     * @return An array of doubles where each element is the corresponding element in the input array divided by 100.
     */
    public static double[] denomination(double[] amounts) {
        double[] array = new double[amounts.length];
        for (int i = 0; i < amounts.length; i++) {
            array[i] = amounts[i] / 100;
        }
        return array;
    }

    public static void printArray(double[] array) {
        for (double i : array) {
            System.out.printf("%.2f", i);
            System.out.println();
        }
    }
}