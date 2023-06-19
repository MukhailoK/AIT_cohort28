package model;

//import javax.validation.constraints.Pattern;
import java.util.Objects;

public class User {
    private String email;
//    @Pattern(regexp = "(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}",
//            message = "Must be minimum 6 characters, at least one letter and one number")
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
    private boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!haseUpperSymb(password)) {
            return false;
        }
        if (!haseLowerSymb(password)) {
            return false;
        }
        if (!haseDigitSymb(password)) {
            return false;
        }
        return haseSpecialSymb(password);
    }

    private boolean haseSpecialSymb(String password) {
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

    private boolean haseDigitSymb(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 47 && password.charAt(i) < 58) {
                return true;
            }
        }
        return false;
    }

    private boolean haseLowerSymb(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 96 && password.charAt(i) < 123) {
                return true;
            }
        }
        return false;
    }

    private boolean haseUpperSymb(String password) {
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
