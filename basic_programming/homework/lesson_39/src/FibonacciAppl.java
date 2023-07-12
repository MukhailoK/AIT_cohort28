import fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        int sum = 0;
        for (int i : fibonacci) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);
        //TODO print all numbers, and reduce sum
        //1,1,2,3,5,8,13,21
        //sum = 54TODO print all numbers, and reduce sum

    }
}
