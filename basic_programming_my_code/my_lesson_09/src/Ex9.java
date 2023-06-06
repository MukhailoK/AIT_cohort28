//Имитация игры в рулетку: целое число от 1 до 36 чет/нечет красное/черное
/**
 * The class generates a random number between 1 and 36 and prints whether it is red or black.
 */
public class Ex9 {
    public static void main(String[] args) {
        redOrBlack();
    }
    /**
     * The function generates a random number between 1 and 36 and prints whether it is red or black based on whether it is
     * even or odd.
     */
    public static void redOrBlack() {
        int random = (int) (Math.random() * 36 + 1);
        if (random % 2 == 0) {
            System.out.println(random + " RED");
        } else
            System.out.println(random + " Black");
    }
}