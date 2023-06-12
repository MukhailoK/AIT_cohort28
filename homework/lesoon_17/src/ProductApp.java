import model.Food;
import model.MIlkFood;
import model.MeatFood;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new MeatFood(7.5, "Beef", 1000110011, "24.06.2023", "mild kow"));
        products.add(new MIlkFood(2.5, "Milk", 10001110, "20.06.2023", "Kefir", 2));
        products.add(new Food(3.20, "Onion", 101100111, "12.12.2023"));
        printProduct(products);
        System.out.println("Total price = " + getTotalPrice(products));
    }

    public static void printProduct(List<Product> products) {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public static double getTotalPrice(List<Product> products) {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
