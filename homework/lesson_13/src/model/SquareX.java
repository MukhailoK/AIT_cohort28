package model;

public class SquareX {
    private int a;
    private int b;
    private int c;

    public SquareX() {
    }

    public SquareX(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double discriminant() {
        if (a != 0) {
            double NaN = 1. / 0;
            int dis = (b * b) - (4 * a * c);
            if (dis < 0) {
                return NaN;
            } else if (dis > 0)
                return Math.sqrt(dis);
        }
        return 0;
    }

    public double x1() {
        return (-this.b - discriminant()) / (2 * this.a);
    }

    public double x2() {
        return (-this.b + discriminant()) / (2 * this.a);
    }

    public String getResult() {
        if (x1() == 1. / 0 || x2() == 1. / 0) {
            return "No Roots";
        }
        if (x1() == x2()) {
            return "Result x = " + x1();
        } else
            return "Result: x1 = " + x1() + ", x2 = " + x2();
    }

}
