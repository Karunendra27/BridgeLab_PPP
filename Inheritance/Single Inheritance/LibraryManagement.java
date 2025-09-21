//Superclass
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

//Subclass
class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);   
        this.name = name;
        this.bio = bio;
    }

    
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("The Java Journey", 2024,
                               "Aeshna Varshney",
                               "AI & Data Analytics student and tech enthusiast.");
        a1.displayInfo();
    }
}
