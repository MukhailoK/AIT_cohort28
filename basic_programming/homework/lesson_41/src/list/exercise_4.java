package list;

import list.interfaces.IList;
import list.model.MyArrayList;

import java.util.HashMap;
import java.util.Random;

public class exercise_4 {
    public static void main(String[] args) {
        IList<Integer> integers = new MyArrayList<>(100);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            integers.addInStart(random.nextInt(1, 11));
        }
        integers.printElements();
        System.out.println("integers have " + countPairs(integers) + " duplicate");
    }

    public static int countPairs(IList<Integer> list) {
        HashMap<Integer, Integer> frequecyMap = new HashMap<>();
        int pairCount = 0;
        for (int num : list) {
            int count = frequecyMap.getOrDefault(num, 0);
            frequecyMap.put(num, count + 1);
        }

        for (int count : frequecyMap.values()) {
            pairCount += count / 2;
        }
        return pairCount;
    }
}
