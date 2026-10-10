import java.lang.String;
import java.lang.System;
public class ProductsValidationConstructor {
    String productName;
    int price;
    boolean valid;

    ProductsConstructor(String productName, int price) {
        if (price > 0) {
            this.productName = productName;
            this.price = price;
            this.valid = true;
        } else {
            System.out.println("Invalid price");
            this.valid = false;
        }
    }

    void display() {
        if (valid) {
            System.out.println("Product name = " + productName);
            System.out.println("Price = " + price);
        }
    }

    public static void main(String... args) {
        ProductsConstructor obj =
            new ProductsConstructor("Jeera", 0);
        obj.display();

        ProductsConstructor obj1 =
        new ProductsConstructor("Garam Masala", 35);
        obj1.display();
    }
}
