class Vehicle {
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Number: " + registrationNumber);
        }
    }
}