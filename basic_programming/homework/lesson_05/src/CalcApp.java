public class CalcApp {

    public static void calc(double a, double b, int oper){
        switch (oper) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            default -> System.out.println("Wrong operation");
        }
    }

}
