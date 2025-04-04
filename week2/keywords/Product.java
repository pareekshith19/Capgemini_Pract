class Product {
    private static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity + ", Discount: " + discount + "%");
        }
    }
}