// Superclass
class Device {
    protected String deviceId;
    protected boolean status;
    
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    private double temperatureSetting;
    
    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    
    @Override
    public void displayStatus() {
        super.displayStatus();
        if (status) {
            System.out.println("Current Temperature Setting: " + temperatureSetting + "°C");
        }
    }
}