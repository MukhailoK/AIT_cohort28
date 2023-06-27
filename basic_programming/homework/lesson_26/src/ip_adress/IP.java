package ip_adress;

//Задача 2 Программа получает на вход IP-адрес в одну строку:
// например, 192.168.23.1 (четыре числа, разделённые точками).
// Каждое число должно быть в диапазоне от 0 до 255.
// Программа должна вывести эти четыре числа по отдельности.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    private String ip;

    public IP() {
    }

    public IP(String ip) {
        if (isValid(ip)) {
            this.ip = ip;
        }
    }

    public void printBlocksIp(String ip) {
        if (isValid(ip)) {
            String temp = "";
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) != '.') {
                    temp += ip.charAt(i);
                } else {
                    System.out.println(temp);
                    temp = "";
                }
            }
            System.out.println(temp);
        }
    }

    public boolean isValid(String ip) {
        if (ip.length() > 7 && (ip.length() < 16)) {
            Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.)" +
                    "{3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(ip);
            return matcher.matches();
        }

        return false;
    }

    @Override
    public String toString() {
        return "IP{" +
                "ip='" + ip + '\'' +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
