public class MultiArray {
    public static void main(String[] args) {
        int[][][][] arr = new int[4][4][4][3];
        arr[1][0][1][0] = 1;

        for (int[][][] ints : arr) {
            for (int[][] anInt : ints) {
                for (int[] i : anInt) {
                    for (int j : i) {

                        System.out.print(j + "\t");
                    }
                    System.out.print("\t");
                }
                System.out.println("\t");
            }
            System.out.println();
        }
    }
}
