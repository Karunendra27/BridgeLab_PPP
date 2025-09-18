import java.util.*;
//interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
//abstract class
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }

    public abstract double calculateTotalPrice();
}
//subclasses
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    @Override

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    @Override

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% off
    }
    @Override

    public String getDiscountDetails() {
        return "5% discount on Veg items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    @Override

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 20; // extra charge
    }
    @Override

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% off
    }
    @Override

    public String getDiscountDetails() {
        return "10% discount on Non-Veg items";
    }
}

public class OnlineFood {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Tikka", 200, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        for (FoodItem f : order) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            double discount = 0;
            if (f instanceof Discountable) {
                discount = ((Discountable) f).applyDiscount();
            }
            System.out.println("Final Amount: " + (total - discount));
        }
    }
}
