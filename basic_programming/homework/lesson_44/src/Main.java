import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        Random random = new Random();
        int rd = random.nextInt(1, 101);
        int rdInd = random.nextInt(0, 100);
        array[rdInd] = rd;
        System.out.println("index of duplicate = "
                + getIndexOfDuplicate(array)
                + ", number = "
                + array[getIndexOfDuplicate(array)]);
    }

    public static int getIndexOfDuplicate(int[] array) {
        int index = -1;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if (array[i] + array[j] != 101) {
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
}
