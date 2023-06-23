package shape;

import shape.model.Circle;
import shape.model.Shape;
import shape.model.Square;
import shape.model.Triangle;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Triangle(6);
        shapes[1] = new Circle(2);
        shapes[2] = new Circle(2);
        shapes[3] = new Square(8);
        System.out.println("Total area of all shapes = " + totalArea(shapes));
        System.out.println("Total perimeter of all shapes = " + totalPerimeter(shapes));
        System.out.println("Total area of all circles = " + totalAreaOfCircles(shapes));

    }

    private static double totalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calcArea();
        }
        return total;
    }

    private static double totalPerimeter(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calcPerimeter();
        }
        return total;
    }

    private static double totalAreaOfCircles(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle)
                total += shape.calcArea();
        }
        return total;
    }
}
