//Задача 1. Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.
public class Exercise1 {
    public static void main(String[] args) {

        int[] arr = new int[]{
                56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        System.out.println("max num = " + getMax(arr));
        System.out.println("index = " + getIndexOfMax(arr));
    }

    public static int getIndexOfMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}