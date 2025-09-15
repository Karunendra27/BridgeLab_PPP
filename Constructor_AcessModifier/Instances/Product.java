class Product {
    // Class variable
    static int totalProducts = 0;

    // Instance variables
    String productName;
    double price;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase count when new product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: ₹" + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p1 = new Product("Mobile", 55000);
        Product p2 = new Product("AC",60000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
