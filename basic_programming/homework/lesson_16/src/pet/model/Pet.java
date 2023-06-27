package pet.model;

public class Pet {
    private String type;
    private double high;
    private boolean leaving;

    public Pet(String type, double high, boolean leaving) {
        this.type = type;
        this.high = high;
        this.leaving = leaving;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", high=" + high +
                ", leaving=" + (leaving ? " at Home" : " on Street") +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public boolean isLeaving() {
        return leaving;
    }

    public void setLeaving(boolean leaving) {
        this.leaving = leaving;
    }
}
