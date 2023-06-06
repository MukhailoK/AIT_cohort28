import model.SquareX;

public class SquareXApp {
    public static void main(String[] args) {
        SquareX squareX1 = new SquareX(1, -8, 15); // Discriminant>0
        SquareX squareX2 = new SquareX(2, -8, 8); //Discriminant==0
        SquareX squareX3 = new SquareX(1, 2, 3); //Discriminant<0
        System.out.println(squareX1.getResult());
        System.out.println(squareX2.getResult());
        System.out.println(squareX3.getResult());

    }
}
