package models;

public class Car extends Vehicle {
    // attributes
    private int numberOfDoors;


    // constructor parameter
    public Car(int vehicleId, String vehicleName, String model, int year, int numberOfDoors) {
        super(vehicleId, vehicleName, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // getter & setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayVehicleDetails() {
        System.out.println("Car ID : " + this.getVehicleId() + " Model : " + this.getModel() + " From : " + this.getYear() + " Has : " + this.numberOfDoors);
    }
}
