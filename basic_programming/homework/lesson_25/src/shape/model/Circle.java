package shape.model;

public class Circle extends Shape {
    private final double PI = Math.PI;

    public Circle(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return PI * Math.pow(fieldSide, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * fieldSide;
    }
}
