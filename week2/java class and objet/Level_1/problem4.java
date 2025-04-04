class problem4 {
    String itemCode;
    String itemName;
    double price;

    public problem4(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        problem4 item1 = new problem4("I001", "Laptop", 1200.00);
        problem4 item2 = new problem4("I002", "Mouse", 25.00);

        item1.displayDetails();
        System.out.println("Total cost for 3 laptops: " + item1.calculateTotalCost(3));

        item2.displayDetails();
        System.out.println("Total cost for 5 mice: " + item2.calculateTotalCost(5));
    }
}