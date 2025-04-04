import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Books can exist without a library (aggregation)
        Book standaloneBook = new Book("Dune", "Frank Herbert");
    }
}