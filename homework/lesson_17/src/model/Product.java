package model;

public class Product {
    private final long barCode;
    private double price;
    private String name;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return
                "Product{" +
                        "barCode=" + barCode +
                        ", price=" + price +
                        ", name='" + name + '\'' +
                        '}';
    }

    public long getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
