import java.util.*;
//interface
interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}
//abstarct class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }
    @Override

    public int getLoanDuration() {
        return 14; // 2 weeks
    }
    @Override

    public void reserveItem(String user) {
        reserved = true;
        System.out.println("Book reserved by " + user);
    }
    @Override

    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }
    @Override

    public int getLoanDuration() {
        return 7; // 1 week
    }
    @Override

    public void reserveItem(String user) {
        reserved = true;
        System.out.println("Magazine reserved by " + user);
    }
    @Override

    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }
    @Override

    public int getLoanDuration() {
        return 3; // 3 days
    }
    @Override

    public void reserveItem(String user) {
        reserved = true;
        System.out.println("DVD reserved by " + user);
    }
    @Override

    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("Ravi");
                System.out.println("Available: " + ((Reservable) item).checkAvailability());
            }
            
        }
    }
}
