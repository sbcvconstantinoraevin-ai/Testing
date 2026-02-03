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
