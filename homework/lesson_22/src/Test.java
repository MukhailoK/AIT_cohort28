import model.User;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        char[] chars = getChars();
        System.out.println("chars: " + Arrays.toString(chars));
        String[] passwords = getPasswords(100_000, chars);

        int countValidPasswords = 0;
        int countValidPasswordsMethods = 0;
        int countValidPasswordsWithRegEx = 0;

        long start = System.currentTimeMillis();
        for (String password : passwords) {
            if (User.validatePassword(password)) {
                countValidPasswords++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time by validatePassword = " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (String password : passwords) {
            if (User.validatePasswordMethods(password)) {
                countValidPasswordsMethods++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Time by validatePasswordMethods = " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (String password : passwords) {
            if (User.validatePasswordRegEx(password)) {
                countValidPasswordsWithRegEx++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Time by validatePasswordRegEx = " + (end - start) + " ms");

        System.out.println("countValidPasswords = " + countValidPasswords);
        System.out.println("countValidPasswordsMethods : " + countValidPasswordsMethods);
        System.out.println("countValidPasswordsWithRegEx : " + countValidPasswordsWithRegEx);
        System.out.println("countValidPasswords == countValidPasswordsMethods : " + (countValidPasswords == countValidPasswordsMethods));
        System.out.println("countValidPasswordMethods == countValidPasswordWithRegEx : " + (countValidPasswordsMethods == countValidPasswordsWithRegEx));

    }

    private static String[] getPasswords(int count, char[] chars) {
        String[] passwords = new String[count];
        for (int i = 0; i < passwords.length; i++) {
            char firstSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char secondSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char thirdSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char fourthSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char fifthSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char sixthSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char seventhSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];
            char eighthSymbol = chars[(int) (Math.random() * (0 - chars.length + 1) + chars.length)];

            String password = "" + firstSymbol + secondSymbol + thirdSymbol + fourthSymbol +
                    fifthSymbol + sixthSymbol + seventhSymbol + eighthSymbol;
            passwords[i] = password;
        }

        return passwords;
    }

    private static char[] getChars() {
        char ch = '0';
        int code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);
        ch = '9';
        code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);
        ch = 'A';
        code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);
        ch = 'Z';
        code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);
        ch = 'a';
        code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);
        ch = 'z';
        code = (int) ch;
        System.out.println("Numeric code of " + ch + " is " + code);

        char c = 43;
        char[] chars = new char[70];
        for (int i = 0; i < chars.length - 5; i++) {
            chars[i] = c;
            c++;
            if (c == '9') {
                c = 'A';
            }
            if (c == 'Z') {
                c = 'a';
            }
        }

        chars[65] = '!';
        chars[66] = '%';
        chars[67] = '@';
        chars[68] = '*';
        chars[69] = '&';

        return chars;
    }
}

