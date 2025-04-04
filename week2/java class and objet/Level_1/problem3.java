class problem3 {
    String title;
    String author;
    double price;

    public problem3(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        problem3 book1 = new problem3("The Lord of the Rings", "J.R.R. Tolkien", 25.99);
        problem3 book2 = new problem3("Pride and Prejudice", "Jane Austen", 12.50);
        book1.displayDetails();

        book2.displayDetails();
    }
}