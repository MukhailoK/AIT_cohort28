package ait.user;

import ait.user.model.User;


public class UserAppl {
    public static void main(String[] args) {
        User user = new User("pe$ter@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("peter@yahoo.com");
        System.out.println(user);
    }
}
