//Имеется массив целых чисел (задать самостоятельно), например,
// оценки студента за семестр.
// Найти средний балл за семестр.
public class Ex4 {
    public static void main(String[] args) {
        int[] grads = new int[]{
                5, 4, 4, 5, 3, 4, 4, 4, 5, 4, 3};
        System.out.printf("%.2f", getAverage(grads));
    }

    public static double getAverage(int[] arrayGrads) {
        double sum = 0;
        for (int i = 0; i < arrayGrads.length; i++) {
            sum += arrayGrads[i];
        }
        return sum / arrayGrads.length;
    }
}
