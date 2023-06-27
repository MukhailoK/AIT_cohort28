package ait.user.model;

public class MeatFood extends Food {
    private final String meatType;

    public MeatFood(double price, String name, long barCode,
                    String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
               " " + super.toString() +
                '}';
    }

    public String getMeatType() {
        return meatType;
    }
}
