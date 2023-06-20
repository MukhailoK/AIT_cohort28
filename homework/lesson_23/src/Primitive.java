//Write application for printing minimal/maximal values of the given primitive types Types as String objects should be taken from the arguments of the main function.
// If there is no any type in the arguments the application should print maximal/minimal values of 7 types
// (byte, int, short, long, char, float, double) If the arguments contain wrong type the application should print message: Wrong type
public class Primitive {
    public static void main(String[] args) {
        System.out.println(checkPimitive(args));
    }

    public static String checkPimitive(String[] args) {
        String res = "";
        for (String a : args) {
            if (a.equals("byte")) {
                res += "byte MIN_VALUE = " + Byte.MIN_VALUE
                        + "\nbyte MAX_VALUE = " + Byte.MAX_VALUE;
            }
            if (a.equals("int")) {
                res += "\nint MIN_VALUE = " + Integer.MIN_VALUE
                        + "\nint MAX_VALUE = " + Integer.MAX_VALUE;
            }
            if (a.equals("short")) {
                res += "\nshort MIN_VALUE = " + Short.MIN_VALUE
                        + "\nshort MAX_VALUE = " + Short.MAX_VALUE;
            }
            if (a.equals("long")) {
                res += "\nlong MIN_VALUE = " + Long.MIN_VALUE
                        + "\nlong MAX_VALUE = " + Long.MAX_VALUE;
            }
            if (a.equals("char")) {
                res += "\nchar MIN_VALUE = " + Character.MIN_VALUE
                        + "\nchar MAX_VALUE = " + Character.MAX_VALUE;
            }
            if (a.equals("float")) {
                res += "\nfloat MIN_VALUE = " + Float.MIN_VALUE
                        + "\nfloat MAX_VALUE = " + Float.MAX_VALUE;
            }
            if (a.equals("boolean")) {
                res += "\nboolean MIN_VALUE = " + Boolean.FALSE
                        + "\nboolean MAX_VALUE = " + Boolean.TRUE;
            }
        }
        if (res.length() == 0) {
            return "byte MIN_VALUE = " + Byte.MIN_VALUE
                    + "\nbyte MAX_VALUE = " + Byte.MAX_VALUE
                    + "\nint MIN_VALUE = " + Integer.MIN_VALUE
                    + "\nint MAX_VALUE = " + Integer.MAX_VALUE
                    + "\nshort MIN_VALUE = " + Short.MIN_VALUE
                    + "\nshort MAX_VALUE = " + Short.MAX_VALUE
                    + "\nlong MIN_VALUE = " + Long.MIN_VALUE
                    + "\nlong MAX_VALUE = " + Long.MAX_VALUE
                    + "\nchar MIN_VALUE = " + Character.MIN_VALUE
                    + "\nchar MAX_VALUE = " + Character.MAX_VALUE
                    + "\nfloat MIN_VALUE = " + Float.MIN_VALUE
                    + "\nfloat MAX_VALUE = " + Float.MAX_VALUE
                    + "\nboolean MIN_VALUE = " + Boolean.FALSE
                    + "\nboolean MAX_VALUE = " + Boolean.TRUE;
        } else
            return res;
    }
}
