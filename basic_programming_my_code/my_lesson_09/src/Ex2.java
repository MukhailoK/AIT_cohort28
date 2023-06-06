//Задача 2. Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных элементов.
// Алгоритм: Как найти нечетный элемент?
// - индекс элемента (arr[i] % 2 != 0) - это для условия внутри if
public class Ex2 {
    public static void main(String[] args) {
        int sum = sumAllOddInArray(new int[]{2,5,4,7,4,6,2,1}); // res 13
        System.out.println(sum);
    }

    public static int sumAllOddInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}