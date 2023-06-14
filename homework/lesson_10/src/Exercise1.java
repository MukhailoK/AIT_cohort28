//***Задача 1.***
//Написать метод, принимающий массив целых чисел, и возвращающий индекс максимального элемента.
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("<>Index of max in array<>");
        System.out.println("in Random array:\n");
        int[] array = randomArr();
        printArray(array);
        System.out.println("\n\nmax number have");

        System.out.println("\nindex: " + indexOfMax(array));
    }

    /**
     * The function generates an array of 10 random integers between 10 and 100 (inclusive).
     *
     * @return An integer array of length 10 with random values between 10 and 100 (inclusive) generated using the
     * Math.random() method.
     */
    public static int[] randomArr() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
        }
        return array;
    }

    /**
     * The function returns the index of the maximum value in an integer array.
     *
     * @param array an integer array for which we want to find the index of the maximum element.
     * @return The method `indexOfMax` returns the index of the maximum value in the input integer array.
     */
    public static int indexOfMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * The function prints out all the elements of an integer array.
     *
     * @param array an integer array that contains the elements to be printed.
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}