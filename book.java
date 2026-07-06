public class Book {

    // ---------- Fields (State) ----------
    private String isbn;            // Unique identifier, e.g., "978-3-16-148410-0"
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    // ---------- Parameterized Constructor ----------
    public Book(String isbn, String title, String author, double price, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    // ---------- Default Constructor ----------
    // Reuses the parameterized constructor with safe fallback values (code reusability via this(...))
    public Book() {
        this("000-0-0000-0000-0", "Unknown", "Unknown", 0.0, 1990);
    }

    // ---------- Getters (optional, useful since fields are private) ----------
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // ---------- Methods (Behaviors) ----------

    /**
     * Returns a cleanly formatted string representing the book.
     * Example: "[978-3-16-148410-0] Title by Author (1997) - 350.0"
     * No console output happens here; this method only returns data.
     */
    public String getDetails() {
        return "[" + isbn + "] " + title + " by " + author +
                " (" + publicationYear + ") - " + price;
    }

    /**
     * Updates the book's price only if the new price is valid (non-negative).
     * Invalid (negative) prices are simply ignored.
     */
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        }
        else{
            System.out.println("มันบ่มีหนังสือนี้ คิงเอาอันใดมา");
        }
    }

    /**
     * Two books are considered the same if they share the exact same ISBN.
     */
    public boolean isSameBook(Book otherBook) {
        if (otherBook == null) {
            return false;
        }
        return this.isbn.equals(otherBook.isbn);
    }
}
