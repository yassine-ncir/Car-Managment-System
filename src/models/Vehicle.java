package models;

public abstract class Vehicle {
    // attributes
    private int vehicleId;
    private String vehicleName;
    private String model;
    private int year;

    // constructor parameter
    public Vehicle(int vehicleId, String vehicleName, String model, int year) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.model = model;
        this.year = year;
    }

    // getter & setter
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayInfo(){
        return "Vehicle ID: " + this.vehicleId + "\nVehicle Name: " + this.vehicleName + "\nModel: " + this.model + "\nYear: " + this.year;
    }

    // abstract method
    abstract void displayVehicleDetails();
}
