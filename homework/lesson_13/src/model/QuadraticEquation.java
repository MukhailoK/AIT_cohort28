package model;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return Math.sqrt((b * b) - (4 * a * c));
    }

    public double x1() {
        return (-this.b - delta()) / (2 * this.a);
    }

    public double x2() {
        return (-this.b + delta()) / (2 * this.a);
    }

    public String getResult() {
        if (quantityRoots() == 2) {
            return "Result: \nx1 = " + x1() + "\nx2 = " + x2();
        } else if (quantityRoots() == 1) {
            return "Result x = " + x1();
        } else
            return "No Roots";
    }

    public int quantityRoots() {
        if (delta() > 0) {
            return 2;
        } else if (delta() == 0) {
            return 1;
        } else
            return 0;
    }

    public void display() {
        System.out.println(
                this.a + "X^2 + "
                        + this.b + "X + "
                        + this.c + " = 0");
    }

    public void printDelta() {
        System.out.println("Delta: \n" +
                this.b + "^2 - 4 * " + a +
                " * " + c + " = " + delta());

    }

    public void printQuantityRoots() {
        System.out.println("Roots: " + quantityRoots());
    }

    public void printResult() {
        System.out.println(getResult());
    }
}
