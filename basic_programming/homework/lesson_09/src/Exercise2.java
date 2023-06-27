//Задача 2. Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
public class Exercise2 {
    public static void main(String[] args) {

        int[] randomArray = new int[20];
        randomArray = drowRandomNumberToArray(randomArray);
        printArray(randomArray);

        System.out.println("\nReplace first-last\n");

        replaceFirstLast(randomArray);
        printArray(randomArray);
    }

    public static int[] drowRandomNumberToArray(int[] emptyArray) {
        int[] array = new int[emptyArray.length];
        for (int i = 0; i < emptyArray.length; i++) {
            array[i] = (int) (Math.random() * (20 - 10 + 1) + 10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void replaceFirstLast(int[] array) {
        int index0 = array[0];
        int index20 = array[array.length - 1];
        array[0] = index20;
        array[array.length - 1] = index0;
    }

}