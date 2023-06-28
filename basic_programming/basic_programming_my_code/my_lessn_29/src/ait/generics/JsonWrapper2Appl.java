package ait.generics;

import ait.generics.utils.JsonWrapper2;

public class JsonWrapper2Appl {

    public static void main(String[] args) {
        JsonWrapper2<Long> wrapper2 = new JsonWrapper2<>(10L);
        System.out.println(wrapper2);
        Long a = wrapper2.getValue();
        System.out.println(a);
        System.out.println("================================");

        JsonWrapper2<Integer> jsonWrapper2 = new JsonWrapper2<>(5);
        System.out.println(jsonWrapper2);
        Integer b = jsonWrapper2.getValue();
        System.out.println(b);
    }
}
