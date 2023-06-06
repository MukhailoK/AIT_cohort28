package ait.utils;

public class ArraysTools {

    /**
     * The function generates an array of random integers within a specified range and size.
     *
     * @param size The size parameter is an integer that represents the length of the array to be generated.
     * @param min  The minimum value that can be generated in the random array.
     * @param max  The maximum value that can be generated in the random array.
     * @return An integer array of size `size` with random values between `min` and `max`, inclusive.
     */
    public static int[] randomArr(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    /**
     * The function reverses the order of elements in an integer array.
     *
     * @param array an integer array that needs to be reversed. The method takes this array as input and modifies it in
     *              place to reverse the order of its elements.
     */
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    /**
     * The function prints out all the elements of an integer array separated by a space.
     *
     * @param array an integer array that contains the elements to be printed.
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * The function prints out each element of a double array with two decimal places.
     *
     * @param array The parameter "array" is a one-dimensional array of type double.
     */
    public static void printArray(double[] array) {
        for (double i : array) {
            System.out.printf("%.2f", i);
            System.out.println();
        }
    }

    /**
     * The function prints the elements of an integer array in reverse order.
     *
     * @param array an integer array that contains the elements to be printed in reverse order.
     */
    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * The function returns the index of a given value in an array or -1 if the value is not found.
     *
     * @param array an integer array in which we want to find the index of a specific value
     * @param value The value parameter is an integer that we are searching for in the given array. The method returns the
     *              index of the first occurrence of the value in the array. If the value is not found in the array, the method returns
     *              -1.
     * @return If the value is found in the array, the index of the first occurrence of the value is returned. If the value
     * is not found in the array, -1 is returned.
     */
    public static int getIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    /**
     * The function implements the bubble sort algorithm to sort an array of integers in ascending order.
     *
     * @param array an integer array that needs to be sorted using the bubble sort algorithm.
     */
    public static void bubbleSort(int[] array) {

        int length = array.length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * The function implements bubble sort algorithm to sort an integer array.
     *
     * @param arr arr is an integer array that needs to be sorted using the bubble sort algorithm.
     */
    public static void bubblesort(int[] arr) {
        while (isSorted(arr)) ;
    }

    /**
     * The function checks if an integer array is sorted and returns a boolean value indicating whether any swaps were made
     * during the sorting process.
     *
     * @param array an integer array that we want to check if it is sorted in ascending order.
     * @return The method is returning a boolean value indicating whether the input array is sorted or not. If the array is
     * sorted, the method returns false. If the array is not sorted, the method returns true.
     */
    public static boolean isSorted(int[] array) {

        boolean flag = false;
        int length = array.length - 1;

        for (int j = 0; j < length; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                flag = true;
            }
        }
        return flag;
    }
}