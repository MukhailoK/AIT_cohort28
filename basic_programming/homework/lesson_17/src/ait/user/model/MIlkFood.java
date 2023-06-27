package ait.user.model;

public class MIlkFood extends Food {
    private final String milkType;
    private final double fat;

    public MIlkFood(double price, String name, long barCode, String expDate,
                    String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return
                "MIlkFood{" +
                        "milkType='" + milkType + '\'' +
                        ", fat=" + fat + " " +
                        super.toString() +
                        '}';
    }

    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }
}
