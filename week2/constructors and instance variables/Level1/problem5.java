class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    double fileSizeMB;

    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookInfo() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}

public class problem5 {
    public static void main(String[] args) {
        Book b1 = new Book("123-456-789", "Java Essentials", "James Gosling");
        b1.displayBookInfo();

        EBook eb1 = new EBook("987-654-321", "Advanced Java", "Sun Microsystems", 5.8);
        eb1.displayEBookInfo();
        System.out.println("Author: " + eb1.getAuthor());
    }
}
