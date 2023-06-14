//Задача 3. Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов, с четными индексами.
public class Exercise3 {
    public static void main(String[] args) {
        int[] testArr = new int[]{
                2, 4, 3, 1, 2, 3, 2, 1, 1, 2, 3}; // res multiPairIndex(testArr) = 72
        System.out.println(multiPairIndex(testArr));
    }

    public static long multiPairIndex(int[] array) {
        long res = 1;
        for (int i = 0; i < array.length; i += 2) { //ver 1
            res *= array[i];
        }
//        for (int i = 0; i < array.length; i++) { //ver 2
//            if (i % 2 == 0) {
//                res *= array[i];
//            }
//        }
        return res;
    }
}