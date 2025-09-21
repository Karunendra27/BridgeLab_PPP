// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass 1
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking delicious " + specialty + ".");
    }
}

// Subclass 2
class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving " + tableCount + " tables.");
    }
}


public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Amit", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Rohit", 201, 5);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
