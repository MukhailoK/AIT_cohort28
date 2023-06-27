
import java.util.Scanner;

public class CalculatorApp {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The main function repeatedly calls the calculatorV2 function and prints the result.
     */

    public static void main(String[] args) {

        System.out.println("\nCalculatorV2");
        double res = calculatorV2();
        System.out.print("Result = ");
        System.out.printf("%.2f", res);
        System.out.println();

        main(null);

    }


    /**
     * The function takes user input for two numbers and an operation, and returns the result of the calculation using the
     * calcV2 method.
     *
     * @return The method `calculatorV2()` is returning a double value which is the result of the calculation performed by
     * the `calcV2()` method. The specific value being returned depends on the input provided by the user through the
     * `getDouble()` and `getOperation()` methods. If the operation is factorial (`n!`), then the result of the factorial
     * calculation is returned. Otherwise, the result of
     */
    public static double calculatorV2() {
        double num2;
        double rez;
        double num1 = getDouble();

        String operation = getOperation();

        if (operation.equals("n!")) {
            rez = calcV2(num1, operation, 0);
            return rez;
        } else
            num2 = getDouble();
        rez = calcV2(num1, operation, num2);
        return rez;
    }

    /**
     * The function prompts the user to input a mathematical operation and validates it before returning it.
     *
     * @return The method `getOperation()` returns a `String` representing the chosen mathematical operation. If the input
     * is not a valid operation, the method recursively calls itself until a valid input is received.
     */
    public static String getOperation() {
        System.out.println("Input one operation: " +
                "(+), (-), (*), (/), (n!), (^), (root)");
        String operation = scanner.next();
        if (operation.equals("+") || operation.equals("-") ||
                operation.equals("/") || operation.equals("*") ||
                operation.equals("n!") || operation.equals("^") ||
                operation.equals("root")) {
            return operation;
        } else {
            return getOperation();
        }
    }

    /**
     * This function prompts the user to input a number and returns it as a double, handling invalid inputs with recursion.
     *
     * @return A double value is being returned.
     */
    public static double getDouble() {
        double number;
        System.out.println("Input number:");
        if (scanner.hasNextDouble()
                || scanner.hasNextInt()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Try again");
            scanner.next();
            number = getDouble();
        }
        return number;
    }

    /**
     * The function takes two numbers and an operation as input and returns the result of the operation applied to the
     * numbers.
     *
     * @param a         The first operand of the mathematical operation.
     * @param operation The "operation" parameter is a String that represents the mathematical operation to be performed on
     *                  the two input numbers "a" and "b". The possible values for "operation" are "+", "-", "*", "/", "^", and "n!", which
     *                  correspond to addition, subtraction, multiplication, division, exponentiation
     * @param b         The parameter "b" is a double data type and represents the second operand in a mathematical operation.
     * @return The method `calcV2` is returning a double value which is the result of the mathematical operation specified
     * by the `operation` parameter on the two input values `a` and `b`. The specific operation to be performed is
     * determined by the `switch` statement based on the value of the `operation` parameter. If the `operation` parameter
     * matches one of the cases, the corresponding method is
     */
    public static double calcV2(double a, String operation, double b) {
        return switch (operation) {
            case "+" -> sum(a, b);
            case "-" -> sub(a, b);
            case "*" -> mul(a, b);
            case "/" -> div(a, b);
            case "^" -> toStep(a, b);
            case "n!" -> factorial(a);
            case "sq" -> rootN(a, (int) b);
            default -> 0;
        };
    }


    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double toStep(double a, double step) {
        double res = a;
        if (step == 0) {
            return 1;
        } else
            for (int i = 1; i < step; i++) {
                res *= a;
            }
        return res;
    }

    public static int factorial(double n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    /**
     * The function calculates the nth root of a given number, including negative numbers for odd roots.
     *
     * @param operand The number for which we want to find the square root.
     * @param sqr     The "sqr" parameter in the above method represents the degree of the root to be calculated. For example,
     *                if sqr is 2, then the method will calculate the square root of the "operand" parameter. If sqr is 3, then the method
     *                will calculate the cube root of the
     * @return The method returns a double value which is the result of taking the nth root of the operand, where n is
     * specified by the sqr parameter. If the operand is negative and the sqr parameter is odd, the method returns the
     * negative nth root of the absolute value of the operand.
     */
    public static double rootN(double operand, int sqr) {
        if (operand < 0 && sqr % 2 == 1) {
            return -Math.pow(-operand, 1. / sqr);
        } else
            return Math.pow(operand, 1. / sqr);
    }

}