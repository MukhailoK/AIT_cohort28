import model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("pe$ter@gmail.com", "1234");
        System.out.println(user);
        user.setEmail("peter@yahoo.com");
        System.out.println(user);
        User user2 = new User("test@gmail.com", "Qwerty7!");
        System.out.println(user2);
        user2.setPassword("Qwerty1@");
        System.out.println(user2);
        user2.setPassword("Qwerty1&");
        System.out.println(user2);
        user2.setPassword("Qwerty1*");
        System.out.println(user2);
        System.out.println("========== test no valid ==========");
        user2.setPassword("Qwerty12");
        System.out.println(user2);
        user2.setPassword("qwerty1%");
        System.out.println(user2);
        user2.setPassword("qwerty1Q");
        System.out.println(user2);
        user2.setPassword("Qwerty1#");
        System.out.println(user2);
    }
}
