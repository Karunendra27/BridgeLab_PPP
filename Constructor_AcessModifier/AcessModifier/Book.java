class Book {
    // Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods for private 'author'
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        // Accessing public ISBN and protected title
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "AI for Beginners", "John Doe", 5.2);
        ebook.displayBook();
        ebook.displayEBook();

        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
