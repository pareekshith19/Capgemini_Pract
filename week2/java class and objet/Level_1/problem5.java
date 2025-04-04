class problem5 {
    String brand;
    String model;
    double price;

    public problem5(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        problem5 phone1 = new problem5("Samsung", "Galaxy S21", 999.99);
        problem5 phone2 = new problem5("Apple", "iPhone 13", 1099.00);

        phone1.displayDetails();

        phone2.displayDetails();
    }
}