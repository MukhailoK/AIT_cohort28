import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<ArrayList> arrayLists = new ArrayList<>();
        ArrayList<ArrayList> arrayLists1= new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
       ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        arrayLists1.add(integers);
        strings.add("Hello");
        arrayLists.add(arrayLists1);
        arrayLists.add(strings);
        System.out.println((arrayLists.get(0).get(0)));

    }
}
