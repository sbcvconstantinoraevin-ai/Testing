package CC3Correctdawto;

// Member 1's unique class
public class Product {
    private String nameOfFood; // Member variable [cite: 12]
    private double price;

    public Product(String nameOfFood, double price) {
        this.nameOfFood = nameOfFood;
        this.price = price;
    }

    // Functional method [cite: 13]
    public String getProductDetails() {
        return nameOfFood + " ($" + price + ")";
    }

    // Identity method [cite: 18]
    public String identifyRole() {
        return "I am the Product Class. I hold information about the details of the items in the shop. [cite: 21]";
    }

    public double getPrice() {
        return price;
    }
}
