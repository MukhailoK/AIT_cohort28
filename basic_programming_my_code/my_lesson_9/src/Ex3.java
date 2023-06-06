//Задача 3. Написать метод, принимающий массив целых чисел, и возвращающий произведение всех его элементов, с четными индексами.
// Алгоритм: Как найти четный индекс элемента? - индекс элемента (i % 2 == 0) - это для условия внутри if
public class Ex3 {
    public static void main(String[] args) {
        int multi = multiplicationAllPaarInArray(new int[]{2, 5, 4, 7, 4, 6, 2, 1}); // res 384
        System.out.println(multi);
    }

    public static int multiplicationAllPaarInArray(int[] array) {
        int mult = 1;
        for (int i : array) {
            if (i % 2 == 0) {
                mult *= i;
            }
        }
        return mult;
    }
}