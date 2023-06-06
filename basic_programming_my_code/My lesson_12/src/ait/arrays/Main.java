package ait.arrays;

import ait.utils.ArraysTools;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Selection sort***");
        int[] array = ArraysTools.randomArr(10, 10, 100);
        System.out.println("\nArray before sort");
        ArraysTools.printArray(array);
        System.out.println("\nArray after sort");
        ArraysTools.bubbleSort(array);
        ArraysTools.printArray(array);

    }
}