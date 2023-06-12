package model;

public class Food extends Product {

    private final String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' + " "
                + super.toString() +
                '}';
    }
}

