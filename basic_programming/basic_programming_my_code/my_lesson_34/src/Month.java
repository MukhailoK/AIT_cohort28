public enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

    public static String getName(int num) {

        Month[] values = values();
        return values[(num - 1) % values.length]
                .name();
    }

    public Month plusMonth(int quantity) {
        int index = ordinal();
        index = index + quantity;
        Month[] values = values();
        int ind = index % values.length;
        if (ind < 0) {
            ind = -ind;
        }
        return values[ind];
    }
}
