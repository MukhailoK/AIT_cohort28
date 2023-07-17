import list.interfaces.IList;
import list.model.MyArrayList;

import java.util.Random;
import java.util.Scanner;

public class ListAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print down size of list");
        int size = scanner.nextInt();
        scanner.nextLine();
        IList<String> list = new MyArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("print name of student");
            String name = scanner.nextLine();
            list.addInStart(name);
        }
        list.printElementsWithIndexes();


    }

}
