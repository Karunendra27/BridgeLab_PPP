import java.util.*;
//interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

//abstract class
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName);
    }

    public abstract double calculateFare(double distance);
}
//subclasses
class CarRide extends RideVehicle implements GPS {
    private String location;

    public CarRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Station";
    }
    @Override

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    @Override

    public String getCurrentLocation() {
        return location;
    }
    @Override

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

class BikeRide extends RideVehicle implements GPS {
    private String location;

    public BikeRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Mall";
    }
    @Override

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    @Override

    public String getCurrentLocation() {
        return location;
    }
    @Override

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

class AutoRide extends RideVehicle implements GPS {
    private String location;

    public AutoRide(String id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Market";
    }
    @Override

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10; // extra base charge
    }
    @Override

    public String getCurrentLocation() {
        return location;
    }
    @Override

    public void updateLocation(String newLoc) {
        location = newLoc;
    }
}

public class RideHailing {
    public static void main(String[] args) {
        List<RideVehicle> rides = new ArrayList<>();
        rides.add(new CarRide("C1", "Aman", 15));
        rides.add(new BikeRide("B2", "Ravi", 10));
        rides.add(new AutoRide("A3", "Suresh", 12));

        for (RideVehicle r : rides) {
            r.getVehicleDetails();
            double fare = r.calculateFare(10);
            System.out.println("Fare for 10 km: " + fare);
        }
    }
}
