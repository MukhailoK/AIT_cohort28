package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    final String email = "kolotailo@gmail.com";
    final String password = "Qwerty12345!";
    User user;

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidPassword() {
        String validPassword = "Ytrewq%43!";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
        System.out.println(user.getPassword());
    }

    @Test
    void testPasswordWithOutCorrectLength() {
        String inValidPassword = "qwe12";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordWithOutUpperCase() {
        String inValidPassword = "qwerty121!";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordWithOutLowerCase() {
        String inValidPassword = "QWERTY121!";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordWithOutSpecSym() {
        String inValidPassword = "Qwerty1212";
        user.setPassword(inValidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordWithLegalSym() {
        String name = "Qwerty123";
        String[] symbols = {"!", "%", "@", "*", "&"};
        String password = "";
        for (String s : symbols) {
            password = s + name;
            user.setPassword(password);
            assertEquals(password, user.getPassword());
        }
    }

    @Test
    void testEmailValid() {
        String validEmail = "validEmail@gmail.com";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
        System.out.println(user.getEmail());
    }

    @Test
    void testEmailWithOutDog() {
        String inValidEmail = "invalidegoogle.com";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithOutDomain() {
        String inValidEmail = "invalide@googlecom";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithMinSymAfterDot() {
        String inValidEmail = "invalide@google.c";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithTwoDogs() {
        String inValidEmail = "ierr@goog@le.com";
        user.setEmail(inValidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithAlphabetic() {
        String email = "qwerty@post.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithDigits() {
        String email = "qwerty12@post.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailWithLegalSym() {
        String name = "test@";
        String postName = "google";
        String domain = ".com";
        String[] symbols = {"_", "-", "."};
        String email = "";
        for (String s : symbols) {
            email = s + name + postName + domain;
            user.setEmail(email);
            assertEquals(email, user.getEmail());
        }
    }
}