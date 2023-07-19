import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = initialArray(100);
        System.out.println("Before");
        printArr(array);
        injectRandomElement(array);
        System.out.println("After");
        printArr(array);
        getResult(array);
    }

    public static int getIndexOfDuplicate(int[] array) {
        int index = -1;
        int sumFirstLast = array.length + 1;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if (array[i] + array[j] != sumFirstLast) {
                if (array[i] != i + 1) {
                    index = i;
                } else {
                    index = j;
                }
                break;
            }
        }
        return index;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void injectRandomElement(int[] array) {
        Random random = new Random();
        int rd = random.nextInt(1, 101);
        int rdInd = random.nextInt(0, 100);
        array[rdInd] = rd;
    }

    public static int[] initialArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void getResult(int[] array) {
        int index = getIndexOfDuplicate(array);
        if (index != -1) {
            System.out.println("\nindex of duplicate = "
                    + index
                    + ", number = "
                    + array[index]);
        } else {
            System.out.println("not found");
        }
    }
}
