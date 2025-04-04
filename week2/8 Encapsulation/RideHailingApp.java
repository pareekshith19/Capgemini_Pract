abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return vehicleId + " driven by " + driverName;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Auto extends RideVehicle implements GPS {
    private String currentLocation;

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) { return distance * 1.2 * super.ratePerKm; }
    public String getCurrentLocation() { return currentLocation; }
    public void updateLocation(String location) { currentLocation = location; }
}
