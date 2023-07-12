package mystring;

import mystring.model.MyString;

import java.util.Iterator;

public class MyStringApp {
    public static void main(String[] args) {
        MyString myString = new MyString("Two beer, or not two beer");
        System.out.println(myString);
//        Iterator<Character> iterator = myString.iterator();
//        while (iterator.hasNext()){
//            char c = iterator.next();
//        System.out.println(c);
//        }
//
//        for (char c : myString) {
//            System.out.println(Character.toUpperCase(c));
//        }
        Iterator<Character> iterator = myString.iterator();
        while (iterator.hasNext()) {
            char c = iterator.next();
            if (c == 'e') {
                iterator.remove();
            }
        }
        System.out.println(myString);
    }
}
