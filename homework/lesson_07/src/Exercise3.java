import java.util.Scanner;

//Задача 3.
// Ввести с клавиатуры 10 пар чисел.
// сравнить числа в каждой паре и напечатать большие из них.
// Использовать цикл for.
public class Exercise3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(">< More or less ><");

        System.out.println("print down ten pars of two numbers (number1, number2)");

        String[] pars = new String[10];
        for (int i = 0; i < 10; i++) {
            pars[i] = scanner.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(biggest(pars[i]));
        }
    }

    public static String biggest(String paar) {
        int i = 0;
        String number1 = "";
        String number2 = "";

        while (paar.charAt(i) != ' ') {
            number1 += paar.charAt(i);
            i++;
        }

        while (i != paar.length()) {
            number2 += paar.charAt(i);
            i++;
        }

        int num1 = Integer.parseInt(number1.trim());
        int num2 = Integer.parseInt(number2.trim());

        if (num1 > num2) {
            return "in par " + number1 + " and" + number2 + " -> " + number1 + " is bigger";
        } else
            return "in par " + number1 + " and" + number2 + " -> " + number2 + " is bigger";
    }
}