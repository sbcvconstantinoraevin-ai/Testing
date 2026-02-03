package CC3Correctdawto;
import java.util.ArrayList;
import java.util.List;

// Member 3's unique class
public class ShoppingCart {
    private List<Product> products = new ArrayList<>(); // Aggregation relationship
    private Customer owner; // Composition relationship

    public ShoppingCart(Customer customer) {
        this.owner = customer;
    }

    public void addProduct(Product p) {
        products.add(p);
    }
    
    // Functional method [cite: 13]
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Identity method [cite: 18]
    public String identifyRole() {
        return "I am the ShoppingCart Class. I organize products and link them to a specific customer. [cite: 21]";
    }
}
