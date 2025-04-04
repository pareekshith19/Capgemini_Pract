import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    private ArrayList<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob");
        Order order1 = new Order();
        order1.addProduct(new Product("Laptop", 999.99));

        bob.placeOrder(order1); // Association
    }
}