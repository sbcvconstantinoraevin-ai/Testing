package CC3Correctdawto;

// Member 2's unique class
public class Customer {
    private String nameOfCustomer; // Member variable [cite: 12]
    private double money;

    public Customer(String nameOfCustomer, double money) {
        this.nameOfCustomer = nameOfCustomer;
        this.money = money;
    }

    // Functional method [cite: 13]
    public String processPayment(double amount) {
        if (money >= amount) {
            return "Payment successful for " + nameOfCustomer;
        }
        return "Insufficient funds for " + nameOfCustomer;
    }

    // Identity method [cite: 18]
    public String identifyRole() {
        return "I am the Customer Class. I manage the buyer's identity and their available funds. [cite: 21]";
    }
}

