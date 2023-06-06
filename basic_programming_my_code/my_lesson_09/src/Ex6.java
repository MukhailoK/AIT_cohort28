/**
 * The Java program generates an array of 10 random numbers between 10 and 100, prompts the user to input a number, and
 * checks if the number is in the array and returns its position(s).
 */
import java.util.Scanner;

//Задать массив из 10 случайных чисел в интервале от 10 до 100. Пользователь вводит интересующее его число.
// Определить, есть ли в массиве такое число. Если есть, то указать на каком оно месте.

public class Ex6 {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The function takes user input, checks its position in a randomly generated array, and prints the position if found.
     */
    public static void main(String[] args) {
        System.out.println("print down your number");
        int number = scanner.nextInt();
        String position = checkPosition(number, randomArr());
        if (!position.equals("")) {
            position.replaceAll(" ", " and");
            System.out.println("your number " + number + " on " + position + "position");
        } else {
            System.out.println("try again");
        }

    }

    public static int[] randomArr() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
        }
        return array;
    }

    /**
     * The function checks the position(s) of a given number in an array and returns the position(s) as a string.
     *
     * @param number The number that we want to check the position(s) of in the array.
     * @param array An array of integers that we want to search for a specific number.
     * @return The method `checkPosition` returns a string containing the positions (indices) of the elements in the input
     * array that match the input number.
     */
    public static String checkPosition(int number, int[] array) {
        String position = "";
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                position += i + " ";
            }
        }
        return position;
    }
}