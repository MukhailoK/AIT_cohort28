package shape.model;

public abstract class Shape {
    public double fieldSide;

    public Shape(double fieldSide) {
        this.fieldSide = fieldSide;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();
}
