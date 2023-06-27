import java.util.Arrays;

//Задан массив целых чисел: 46, 13, 1, 10, 67, -4, 20, 56, 11, 35.
// Выполнить сортировку массива от меньшего к большему.
public class Ex7 {


    public static void main(String[] args) {
         int[] arr = new int[]{
                46, 13, 1, 10, 67, -4, 20, 56, 11, 35};
        Arrays.sort(arr);
     printArray(arr);
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
