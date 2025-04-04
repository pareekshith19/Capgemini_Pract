abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemDetails() {
        return itemId + ": " + title + " by " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() { return 14; }
    public boolean reserveItem() { return true; }
    public boolean checkAvailability() { return true; }
}