//Задание 1 Алгоритм "бинарный поиск" https://www.youtube.com/watch?v=SW_UCzFO7X0&list=PLawfWYMUziZqyUL5QDLVbe3j5BKWj42E5&index=2 время 16:56
// Задать массив из произвольных целых чисел на 10 элементов.
// Описать словами алгоритм бинарного поиска. Реализовать метод, котороый получает на вход массив и искомое число,
// возвращает true, если число есть в массиве и false, если числа нет.

import java.util.Scanner;

public class Exercise1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Binary search in sorted array");
        int[] array = sortedArr();
        System.out.println("In array:");
        printArray(array);
        System.out.println("\nprint down searched number");
        int num = scanner.nextInt();
        System.out.print(num + ":");
        if (isPresent(num, array)) {
            System.out.println(" present");
        } else {
            System.out.println(" not present");
        }
    }

    /**
     * This function checks if a given integer is present in a sorted integer array using binary search.
     *
     * @param searched an integer value that we are searching for in the sortedArray.
     * @param sortedArray an array of integers that is sorted in ascending order
     * @return The method is returning a boolean value - true if the searched element is present in the sortedArray, and
     * false if it is not present.
     */
    public static boolean isPresent(int searched, int[] sortedArray) {
        // в начале левая и правая границы равны первому и последнему элементу массива
        int left = 0;
        int right = sortedArray.length - 1;
        // пока левая и правая границы поиска не пересеклись
        while (left <= right) {
            // индекс текущего элемента находится посередине
            int middle = (left + right) / 2;
            int current = sortedArray[middle];
            if (current == searched) {
                // нашли элемент - возвращаем true
                return true;
            } else if (current < searched) {
                // текущий элемент меньше искомого - сдвигаем левую границу
                left = middle + 1;
            } else {
                // иначе сдвигаем правую границу
                right = middle - 1;
            }
        }
        // проверили весь массив, но не нашли элемент - false
        return false;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedArr() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+4;
        }
        return array;
    }
}