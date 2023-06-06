import java.util.Scanner;

//Запросить длину массива целых чисел у пользователя,
// занести данные в массив, сделать "разворот" массива
// (последний элемент должен стать первым и т.д.).
public class Ex5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("<> Reverse array <>");
        System.out.println("print down your size of array");

        int size = scanner.nextInt();

        System.out.println("print down " + size + " integers");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("before reverse:");
        printArray(arr);

        System.out.println("\n after reverse:");
        printArray(reverseArray(arr));
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        int r = array.length - 1;
        for (int j : array) {
            reversed[r] = j;
            r--;
        }
        return reversed;
    }
}