package user.model;


import java.util.Objects;

public class User {
    private String email;

    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    private static boolean validatePassword(String password) {
        boolean validUpper = false;
        boolean validLower = false;
        boolean validDigit = false;
        boolean validSpecSymb = false;

        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!validUpper) {
                validUpper = Character.isUpperCase(password.charAt(i));
            }
            if (!validLower) {
                validLower = Character.isLowerCase(password.charAt(i));
            }
            if (!validDigit) {
                validDigit = Character.isDigit(password.charAt(i));
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
