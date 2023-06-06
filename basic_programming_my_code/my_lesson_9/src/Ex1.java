import java.util.Scanner;

//Задача 1. Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.
// Алгоритм: Шаг 1 - объявить/создать массив, тип int[10]
// Шаг 2 - внести данные (включить фантазию - придумать начальные данные)
// Шаг 3 - ключевой оператор - это цикл for Шаг 4 - пробегаем по индексам i от последнего arr.length - 1 до 0 Внутри цикла печатаем элементы массива arr[i]
public class Ex1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Print array in reverse");

        int[] array = initializationIntArray(3);

        System.out.println("Your array");

        printArray(array);

        System.out.println("\n\nin reverse");

        printArrayInReverse(array);
    }

    public static int[] initializationIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}