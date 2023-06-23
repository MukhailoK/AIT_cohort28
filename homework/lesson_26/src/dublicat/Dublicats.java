package dublicat;

import java.util.Random;

//Task 2 Set an array of 10 elements and fill it with random numbers
// in the range from -10 to 10. Print the resulting array.
// Find the sum of the array elements with odd indexes.
// Develop an appropriate test (test suite).

//Задача 1 Задайте массив на 10 элементов и заполните его случайными
// числами в интервале от -10 до 10. Распечатайте полученный массив.
// Создайте метод, который определяет наличие дубликатов в массиве.
// Разработайте соответсвующий тест (набор тестов).
public class Dublicats {

    int[] arr;

    public Dublicats(int size) {
        this.arr = fillArray(new int[size]);
    }

    public Dublicats() {
    }

    public Dublicats(int[] arr) {
        this.arr = arr;
    }

    public int[] fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
        }
        return arr;
    }

    public int getSumOfOdd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                res += arr[i];
            }
        }
        return res;
    }

    public boolean isDublicatPresent(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
