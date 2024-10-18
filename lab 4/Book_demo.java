

package lab.book_demo;
        class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Set methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Get methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // toString method
    @Override
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}
public class Book_demo {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Developing Java Software", "Russel Winder", 79.75);
        
        // Print the book's initial details
        System.out.println(book.toString());

        // Update the book's title and price using set methods
        book.setTitle("Advanced Java Software");
        book.setPrice(89.99);

        // Print the updated book's details
        System.out.println("After updates:");
        System.out.println(book.toString());
        
        // Get the author using get method
        String authorName = book.getAuthor();
        System.out.println("Author: " + authorName);
    }
}
