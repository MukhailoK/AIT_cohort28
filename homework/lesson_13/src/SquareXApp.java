import model.QuadraticEquation;
//Задача 1. Создать класс QuadraticEquation в пакете ait.equation.model.
// В этом классе определить поля private double a; private double b; private double c;.
// Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
// Создать геттеры и сеттеры. Создать метод public void display() для печати в консоль квадратного уравнения.
// Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта и колличества решений уранения соотвественно.
// Создать клас EquationAppl в пакете ait.equation с методом main.
// В методе main создать несколько экземпляров QuadraticEquation и вывести для каждого из них результаты работы методов display, delta, quantityRoots.

public class SquareXApp {
    public static void main(String[] args) {
        QuadraticEquation squareX1 = new QuadraticEquation(1, -8, 15); // Discriminant>0
        QuadraticEquation squareX2 = new QuadraticEquation(2, -8, 8); //Discriminant==0
        QuadraticEquation squareX3 = new QuadraticEquation(1, 2, 3); //Discriminant<0

        squareX1.display();
        squareX1.printDelta();
        squareX1.printQuantityRoots();
        squareX1.printResult();
        System.out.println();

        squareX2.display();
        squareX2.printDelta();
        squareX2.printQuantityRoots();
        squareX2.printResult();
        System.out.println();

        squareX3.display();
        squareX3.printDelta();
        squareX3.printQuantityRoots();
        squareX3.printResult();

    }
}
