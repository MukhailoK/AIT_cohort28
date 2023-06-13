import model.Food;
import model.MeatFood;
import model.MilkFood;
import model.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product[] kiosk = new Product[5];
        kiosk[0] = new Product(50, "Gift card", 1000);
        kiosk[1] = new MeatFood(70, "Sosages Mizra", 2000, "31.07.2023", "beef");
        kiosk[2] = new MilkFood(95, "Goat cheese", 3000, "25.08.2023", "goat", 40);
        kiosk[3] = new Food(20, "Coca Cola", 4000, "30.07.2023");
        kiosk[4] = new Product(6.8, "Heats for IQOS", 5000);

        System.out.println("====== All products ======");
        printProducts(kiosk);

        System.out.println("====== Stats ======");
        double res = totalPrice(kiosk);
        System.out.println("Sum of prices = " + res);

        System.out.println("======= Not food =======");
        getAllNotFoodProd(kiosk);
        System.out.println("======= Get product for barcode ========");
        System.out.println("Get for not exist barcode 999: " + getProduct(999, kiosk));
        System.out.println(getProduct(4000, kiosk));

    }

    private static double totalPrice(Product[] products) {
        double res = 0;
        for (Product product : products) {
            res += product.getPrice(); //res = res + products[i].getPrice();
        }
        return res;
    }

    private static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void getAllNotFoodProd(Product[] products) {
        for (Product p : products) {
            if (!(p instanceof Food)) {
                System.out.println(p);
            }
        }
    }

    private static Object getProduct(long barcode, Product[] products) {
        for (Product product : products) {
            if (product.equals(barcode)) {
                return product;
            }
        }
        return "Not found";
    }

}
