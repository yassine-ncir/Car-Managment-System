package models;

public class Truck extends Vehicle {
    // attributes
    private int loadCapacity;

    // constructor parameter
    public Truck(int vehicleId, String vehicleName, String model, int year, int loadCapacity) {
        super(vehicleId, vehicleName, model, year);
        this.loadCapacity = loadCapacity;
    }

    // getter & setter
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayVehicleDetails() {
        System.out.println("Car ID : " + this.getVehicleId() + " Model : " + this.getModel() + " From : " + this.getYear() + " Has " + this.getLoadCapacity() + "Load capacity ");
    }
}
