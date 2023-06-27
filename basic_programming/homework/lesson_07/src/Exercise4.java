//Задача 4. ()*
// Найти произведение двузначных нечетных чисел кратных 13.
public class Exercise4 {
    public static void main(String[] args) {
        long res = 1;
        for (int i = 1; i < 100; i++) {
            if (i % 13 == 0) {
                res *= i;
            }
        }
        System.out.println("the product of two-digit odd numbers divisible by 13 = " + res);
    }
}