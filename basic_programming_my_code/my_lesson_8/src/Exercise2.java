//Задача 2. Написать метод, принимающий массив целых чисел,
// и возвращающий сумму всех его нечетных элементов
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(sumOdd(new int[]{1, 3, 3, 2, 4, 6, 8}));
    }

    public static int sumOdd(int[] array) {
        int res = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                res += i;
            }
        }
        return res;
    }
}
