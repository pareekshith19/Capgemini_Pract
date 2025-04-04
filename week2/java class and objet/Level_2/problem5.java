import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        for (CartItem item : items) {
            if (item.itemName.equalsIgnoreCase(name)) {
                item.quantity += quantity;
                return;
            }
        }
        items.add(new CartItem(name, price, quantity));
    }

    void removeItem(String name) {
        Iterator<CartItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(name)) {
                iterator.remove();
                return;
            }
        }
    }

    double getTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        for (CartItem item : items) {
            System.out.println(item.itemName + " - " + item.quantity + " x $" + item.price);
        }
        System.out.printf("Total Cost: $%.2f%n", getTotalCost());
    }
}

public class problem5 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Item  2. Remove Item  3. View Cart  4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Item Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                cart.addItem(name, price, quantity);
            } else if (choice == 2) {
                System.out.print("Item Name to Remove: ");
                String name = scanner.nextLine();
                cart.removeItem(name);
            } else if (choice == 3) {
                cart.displayCart();
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
