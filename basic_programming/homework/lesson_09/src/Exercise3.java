import java.util.Arrays;

//Задача 3. ()* Заполнить двухмерный массив 8 х 8 элементами 0 и 1, как на шахматной достке.
// 1 - черное поле, 0 - белое поле Вывести массив на печать.
public class Exercise3 {
    public static final int X = 8;
    public static final int Y = 8;

    public static void main(String[] args) {
        int[][] chess = createBoard(X, Y);
        printS_ndArr(chess);
    }

    public static int[][] createBoard(int X, int Y) {
        int[][] board = new int[X][Y];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = 1;
                }
            }
        }
        return board;
    }

    public static void printS_ndArr(int[][] array) {
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}