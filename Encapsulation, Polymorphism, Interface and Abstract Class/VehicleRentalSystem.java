import java.util.*;
//interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
//abstarct class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    //encapsulation
    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }
    public String getType() { return type; }

    public abstract double calculateRentalCost(int days);
}
//subclasses
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Car insurance: Rs 500";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return 200;
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: Rs 200";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // extra charges
    }
    @Override
    public double calculateInsurance() {
        return 1000;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: Rs 1000";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 2000));
        vehicles.add(new Bike("B202", 500));
        vehicles.add(new Truck("T303", 3000));

        for (Vehicle v : vehicles) {
            double cost = v.calculateRentalCost(5);
            double insurance = ((Insurable)v).calculateInsurance();
            System.out.println(v.getType() + " " + v.getVehicleNumber() +
                               "Cost: " + cost + ", Insurance: " + insurance);
        }
    }
}
