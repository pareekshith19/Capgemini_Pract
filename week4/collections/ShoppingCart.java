import java.util.*;

public class ShoppingCart {

    static class CartManager {
        Map<String, Double> hashMap = new HashMap<>();
        Map<String, Double> linkedHashMap = new LinkedHashMap<>();
        Map<String, Double> treeMap = new TreeMap<>(Comparator.comparing(hashMap::get));

        public void addItem(String product, double price) {
            hashMap.put(product, price);
            linkedHashMap.put(product, price);
            treeMap.put(product, price);
        }

        public void displayCart() {
            System.out.println("Items in HashMap (unordered):");
            hashMap.forEach((product, price) -> System.out.println(product + ": $" + price));

            System.out.println("\nItems in LinkedHashMap (order of adding):");
            linkedHashMap.forEach((product, price) -> System.out.println(product + ": $" + price));

            System.out.println("\nItems in TreeMap (sorted by price):");
            treeMap.forEach((product, price) -> System.out.println(product + ": $" + price));
        }

        public double getTotalPrice() {
            return linkedHashMap.values().stream().mapToDouble(Double::doubleValue).sum();
        }
    }

    public static void main(String[] args) {
        CartManager manager = new CartManager();

        manager.addItem("Laptop", 1200.00);
        manager.addItem("Phone", 800.00);
        manager.addItem("Headphones", 150.00);
        manager.addItem("Tablet", 400.00);

        manager.displayCart();

        System.out.println("\nTotal Price: $" + manager.getTotalPrice());
    }
}
