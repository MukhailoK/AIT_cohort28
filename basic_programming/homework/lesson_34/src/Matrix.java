public class Matrix {

    public static int sum(int[][] matrix) {
        int res = 0;
        for (int[] arr : matrix) {
            for (int i : arr) {
                res += i;
            }
        }
        return res;
    }

    public static int[][] transp(int[][] matrix) {
        int[][] res =
                new int[matrix[matrix.length - 1].length][matrix.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix2.length == matrix1[matrix1.length - 1].length) {
            int[][] res =
                    new int[matrix1.length][matrix2[matrix1.length - 1].length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    for (int n = 0; n < matrix2.length; n++) {
                        res[i][j] += matrix1[i][n] * matrix2[n][j];
                    }
                }
            }
            return res;
        }
        return null;
    }
}
