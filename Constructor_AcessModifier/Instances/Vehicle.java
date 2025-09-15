class Vehicle {
    // Class variable
    static double registrationFee = 5000;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                           ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: ₹" + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aeshna", "Car");
        Vehicle v2 = new Vehicle("Arpita", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        System.out.println("\nAfter Updating Registration Fee:\n");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
