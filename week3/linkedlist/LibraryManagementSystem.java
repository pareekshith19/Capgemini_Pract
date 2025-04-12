class LibraryManagement {
    static class Book {
        String title, author, genre;
        int bookId;
        boolean isAvailable;
        Book next, prev;

        Book(String title, String author, String genre, int bookId, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
        }
    }

    Book head = null, tail = null;

    void addBook(String title, String author, String genre, int bookId, boolean available) {
        Book newBook = new Book(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void removeBook(int bookId) {
        Book temp = head;
        while (temp != null && temp.bookId != bookId) temp = temp.next;
        if (temp == null) return;

        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void updateAvailability(int bookId, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = available;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitleOrAuthor(String keyword) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.title + " by " + temp.author + " [" + (temp.isAvailable ? "Available" : "Not Available") + "]");
            }
            temp = temp.next;
        }
    }

    void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | ID: " + temp.bookId + " | " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }

    void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | ID: " + temp.bookId + " | " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }

    void countTotalBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();
        lm.addBook("The Hobbit", "Tolkien", "Fantasy", 201, true);
        lm.addBook("1984", "Orwell", "Dystopia", 202, false);
        lm.addBook("The Alchemist", "Coelho", "Adventure", 203, true);

        lm.displayBooksForward();
        System.out.println("\nReverse:");
        lm.displayBooksReverse();
        lm.countTotalBooks();
        System.out.println("\nSearch Results:");
        lm.searchByTitleOrAuthor("Tolkien");
        lm.updateAvailability(202, true);
        lm.removeBook(203);
        System.out.println("\nAfter Updates:");
        lm.displayBooksForward();
    }
}
