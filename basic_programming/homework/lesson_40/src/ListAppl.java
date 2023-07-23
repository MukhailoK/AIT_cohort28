import ait.list.interfaces.IList;
import ait.list.model.MyArrayList;

public class ListAppl {
    public static void main(String[] args) {
        IList<Integer> list = new MyArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(null);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(4));
//        System.out.println(list.get(7));
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(7));
        System.out.println(list.contains(5));
        System.out.println(list.contains(-5));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(null));
        System.out.println("===== Test Homework =====");

        list.add(2, 10);
        list.add(5, 10);
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println("====Remove====");
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.remove(2));
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println("test for-each");
        for (Integer i : list) {
            System.out.println(i);

        }
        System.out.println("====set=====");
        list.set(1, 4);
        System.out.println(list.get(1));
        System.out.println("====================");
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

    }
}
