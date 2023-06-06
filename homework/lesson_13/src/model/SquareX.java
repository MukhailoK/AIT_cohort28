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
        return Math.sqrt((b * b) - (4 * a * c));
    }

    public double x1() {
        return (-this.b - discriminant()) / (2 * this.a);
    }

    public double x2() {
        return (-this.b + discriminant()) / (2 * this.a);
    }

    public String getResult() {
        if (discriminant() > 0) {
            return "Result: x1 = " + x1() + ", x2 = " + x2();
        } else if (discriminant() == 0) {
            return "Result x = " + x1();
        } else
            return "No Roots";
    }
}
