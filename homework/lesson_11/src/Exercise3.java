//Задача 3. Найти алгоритм selection sort. https://www.geeksforgeeks.org/selection-sort/ Задать массив из произвольных целых чисел.
// Реализовать метод, получающий на вход массив и сортирующий его по алгоритму selection sort.

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("***Selection sort***");
        int[] array = randomArr();
        System.out.println("\nArray before sort");
        printArray(array);
        System.out.println("\nArray after sort");
        sort(array);
        printArray(array);

    }

    public static int[] randomArr() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * The function sorts an array of integers in ascending order using selection sort algorithm.
     *
     * @param array an integer array that needs to be sorted in ascending order. The method uses selection sort algorithm
     * to sort the array.
     */
    public static void sort(int[] array) {
        int n = array.length;
        // This is the implementation of the selection sort algorithm. The outer loop iterates through the array from the
        // first element to the second to last element. The inner loop finds the minimum element in the unsorted portion of
        // the array and swaps it with the first element in the unsorted portion. This process is repeated until the entire
        // array is sorted in ascending order.
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
}