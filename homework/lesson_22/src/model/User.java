package model;


import java.util.Objects;

public class User {
    private String email;

    private String password;

    public User(String email, String password) {
        setEmail(email);

        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid");
        }

    }

    /*
    1) @ exists and only one (done)
    2) dot after @ (done)
    3) after last dot minimum 2 symbols (done)
    4) alphabetic, digits, _ , - , . , @
     */
    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password not valid");
        }

    }

    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */

    //===========================================================
    //V1
    public static boolean validatePasswordRegEx(String password) {
        return password.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!%@*&]).{8,}");
        }
//=============================================================

    //V2
    public static boolean validatePassword(String password) {

        boolean validUpper = false;
        boolean validLower = false;
        boolean validDigit = false;
        boolean validSpecSymb = false;

        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!validUpper) {
                validUpper = password.charAt(i) > 64 && password.charAt(i) < 91;
            }
            if (!validLower) {
                validLower = password.charAt(i) > 96 && password.charAt(i) < 123;
            }
            if (!validDigit) {
                validDigit = password.charAt(i) > 47 && password.charAt(i) < 58;
            }
            if (!validSpecSymb) {
                validSpecSymb = (password.charAt(i) == '!'
                        || password.charAt(i) == '%'
                        || password.charAt(i) == '@'
                        || password.charAt(i) == '*'
                        || password.charAt(i) == '&');
            }
        }
        return validUpper && validDigit && validLower && validSpecSymb;
    }
    //==================================================================
    //V3
    public static boolean validatePasswordMethods(String password) {
        return checkLength(password)
                && haseUpperSymb(password)
                && haseLowerSymb(password)
                && haseDigitSymb(password)
                && haseSpecialSymb(password);

    }

    private static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    private static boolean haseSpecialSymb(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '!'
                    || password.charAt(i) == '%'
                    || password.charAt(i) == '@'
                    || password.charAt(i) == '*'
                    || password.charAt(i) == '&') {
                return true;
            }
        }
        return false;
    }

    private static boolean haseDigitSymb(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 47 && password.charAt(i) < 58) {
                return true;
            }
        }
        return false;
    }

    private static boolean haseLowerSymb(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 96 && password.charAt(i) < 123) {
                return true;
            }
        }
        return false;
    }

    private static boolean haseUpperSymb(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 64 && password.charAt(i) < 91) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
