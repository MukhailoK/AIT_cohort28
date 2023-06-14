//***Задача 3.***
//Написать метод, принимающий массив целых чисел, и разворачивающий его.
// Последний элемент становится нулевым, предпоследний, первым, и т. д.
// Подсказка: этот метод должен изменить полученный массив
public class Exercise3 {
    public static void main(String[] args) {

        System.out.println("~~Reverse Array~~");

        int[] array = randomArr();
        printArray(array);
        reverse(array);

        System.out.println("\nReversed:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] randomArr() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
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
}