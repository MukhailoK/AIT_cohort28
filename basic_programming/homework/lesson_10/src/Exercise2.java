//***Задача 2.***
//Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("   ^Get average of array^");
        int[] array = randomArr();
        printArray(array);
        System.out.println("\n   Average of this array:");
        System.out.printf("          %.2f", getAverage(array));
    }

    /**
     * The function calculates the average of an array of integers.
     *
     * @param array The parameter "array" is an integer array that contains the values for which we want to calculate the
     * average.
     * @return The method `getAverage` returns the average (mean) value of the elements in the input integer array.
     */
    public static double getAverage(int[] array) {
        double sum = 0;
        for (int arrayGrad : array) {
            sum += arrayGrad;
        }
        return sum / array.length;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] randomArr() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
        }
        return array;
    }

}