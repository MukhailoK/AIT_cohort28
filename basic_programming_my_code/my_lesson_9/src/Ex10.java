import java.util.Random;

//Имитация броска 2-мя кубиками с 6 гранями. Использовать двухмерный массив.
public class Ex10 {

    public static final int[][] cubes = createCubes();
    public static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("%Cubes%");

        // This line of code is printing a randomly generated sum of two numbers between 2 and 12, which simulates rolling
        // two 6-sided dice. The `cubes` array contains all possible sums of two dice rolls, and `random.nextInt(6)` is
        // used twice to generate two random indices for the array. The resulting sum is then printed to the console. The
        // string "U have\n" is simply a message that is printed before the sum.
        System.out.println(
                "U have\n" +
                        cubes[random.nextInt(6)][random.nextInt(6)]
        );
    }

    public static int[][] createCubes() {
        int[][] cubes = new int[6][6];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                cubes[i - 1][j - 1] = j + i;
            }
        }
        return cubes;
    }
}
