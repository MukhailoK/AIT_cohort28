package shape.model;

public class Triangle extends Shape {


    public Triangle(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 2) * Math.pow(fieldSide, 2);
    }

    @Override
    public double calcPerimeter() {
        return fieldSide * 3;
    }
}
