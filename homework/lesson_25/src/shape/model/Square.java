package shape.model;

public class Square extends Shape {


    public Square(double fieldSide) {
        super(fieldSide);
    }

    @Override
    public double calcArea() {
        return Math.pow(fieldSide, 2);
    }

    @Override
    public double calcPerimeter() {
        return fieldSide * 4;
    }
}
