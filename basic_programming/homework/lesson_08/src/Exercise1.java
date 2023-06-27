//Задача 1. Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т. д.
public class Exercise1 {

    public static void main(String[] args) {

        printArrayInReverse(new int[]{
                10, 5, -5, 7, 12
        });
    }

    public static void printArrayInReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}