public class Main {

    public static void main(String[] args) {
        System.out.println(" min = " + min(89, 76));
    }

    public static double abs(double x) {
        return x < 0 ? -x : x;
    }

    public static double min(double x, double y) {
        return (x + y - abs(x - y)) / 2;
    }
}


