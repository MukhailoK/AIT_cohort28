import java.util.Random;

//Задание 3 Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм. Напишите программу, которая ищет счастливый пельмень.

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("&&Lucky pelmen'&&");
        int[] pelmens = packWithPelmens();
        createLuckyPelmen(pelmens);
        int luckyPosition = getPosition(pelmens);
        if (luckyPosition > -1) {
            System.out.println("I found lucky pelmen on " + luckyPosition + " position");
        } else {
            System.out.println("I not found lucky pelmen");
        }
    }

    public static int[] packWithPelmens() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = 25;
        }
        return array;
    }

    /**
     * The function creates a lucky pelmen by adding 15 to a randomly selected element in an integer array.
     *
     * @param array an integer array that is passed as a parameter to the method `createLuckyPelmen`. The method generates
     * a random index between 0 and 29 (inclusive) and adds 15 to the value at that index in the array. This method
     * modifies the original array passed as a parameter.
     */
    public static void createLuckyPelmen(int[] array) {
        Random random = new Random();
        int index = random.nextInt(30);
        array[index] = array[index] + 15;
    }

    public static int getPosition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 40)
                return i;
        }
        return -1;
    }
}