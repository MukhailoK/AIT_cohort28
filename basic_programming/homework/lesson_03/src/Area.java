public class Area {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(5));
        System.out.println(areaOfSquare(2));
        System.out.println(areaOfRectangle(3, 5));
    }

    public static String areaOfCircle(double radius) {
        if (radius > 0) {
            return "Area of circle with radius "
                    + radius
                    + " = "
                    + Math.PI * Math.pow(radius, 2);
        } else
            return "Invalid radius";
    }

    public static String areaOfSquare(double size) {
        if (size > 0) {
            return "Area of square with size "
                    + size
                    + " = "
                    + Math.pow(size, 2);
        } else
            return "Invalid size";

    }

    public static String areaOfRectangle(double width, double height) {
        if (width > 0 && height > 0) {
            return "Area of rectangle with width "
                    + width
                    + " and height "
                    + height
                    + " = "
                    + width * height;
        } else
            return "Invalid rectangle";
    }
}
