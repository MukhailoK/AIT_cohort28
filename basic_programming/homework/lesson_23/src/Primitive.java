//Write application for printing minimal/maximal values of the given primitive types Types as String objects should be taken from the arguments of the main function.
// If there is no any type in the arguments the application should print maximal/minimal values of 7 types
// (byte, int, short, long, char, float, double) If the arguments contain wrong type the application should print message: Wrong type
public class Primitive {
    public static void main(String[] args) {
        System.out.println(checkPrimitive(args));
    }

    public static String checkPrimitive(String[] args) {
        StringBuilder res = new StringBuilder();
        int match = 0;
        for (String a : args) {
            switch (a) {
                case "byte":
                    res.append("\nbyte MIN_VALUE = " + Byte.MIN_VALUE);
                    res.append("\nbyte MAX_VALUE = " + Byte.MAX_VALUE);
                    match++;
                    break;
                case "int":
                    res.append("\nint MIN_VALUE = " + Integer.MIN_VALUE);
                    res.append("\nint MAX_VALUE = " + Integer.MAX_VALUE);
                    match++;
                    break;
                case "short":
                    res.append("\nshort MIN_VALUE = " + Short.MIN_VALUE);
                    res.append("\nshort MAX_VALUE = " + Short.MAX_VALUE);
                    match++;
                    break;
                case "long":
                    res.append("\nlong MIN_VALUE = " + Long.MIN_VALUE);
                    res.append("\nlong MAX_VALUE = " + Long.MAX_VALUE);
                    match++;
                    break;
                case "char":
                    res.append("\nchar MIN_VALUE = " + ((int) Character.MIN_VALUE));
                    res.append("\nchar MAX_VALUE = " + ((int) Character.MAX_VALUE));
                    match++;
                    break;
                case "float":
                    res.append("\nfloat MIN_VALUE = " + Float.MIN_VALUE);
                    res.append("\nfloat MAX_VALUE = " + Float.MAX_VALUE);
                    match++;
                    break;
                case "boolean":
                    res.append("\ndouble MIN_VALUE = ")
                            .append(Double.MIN_VALUE)
                            .append("\ndouble MAX_VALUE = ")
                            .append(Double.MAX_VALUE);
                    match++;
                    break;
                default:
                    res.append("\nWrong argument : ")
                            .append(a);
                    break;
            }
        }
        if (match == 0) {
            return "byte MIN_VALUE = " + Byte.MIN_VALUE
                    + "\nbyte MAX_VALUE = " + Byte.MAX_VALUE
                    + "\nint MIN_VALUE = " + Integer.MIN_VALUE
                    + "\nint MAX_VALUE = " + Integer.MAX_VALUE
                    + "\nshort MIN_VALUE = " + Short.MIN_VALUE
                    + "\nshort MAX_VALUE = " + Short.MAX_VALUE
                    + "\nlong MIN_VALUE = " + Long.MIN_VALUE
                    + "\nlong MAX_VALUE = " + Long.MAX_VALUE
                    + "\nchar MIN_VALUE = " + ((int) Character.MIN_VALUE)
                    + "\nchar MAX_VALUE = " + ((int) Character.MAX_VALUE)
                    + "\nfloat MIN_VALUE = " + Float.MIN_VALUE
                    + "\nfloat MAX_VALUE = " + Float.MAX_VALUE
                    + "\ndouble MIN_VALUE = " + Double.MIN_VALUE
                    + "\ndouble MAX_VALUE = " + Double.MAX_VALUE;
        } else
            return res.toString();
    }
}
