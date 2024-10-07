package models;

public class Motocycle extends Vehicle {
    // attributes
    private Boolean hasSideCar;

    // constructor parameter
    public Motocycle(int vehicleId, String vehicleName, String model, int year, Boolean hasSidecar) {
        super(vehicleId, vehicleName, model, year);
        this.hasSideCar = hasSidecar;
    }

    // getter & setter
    public Boolean getHasSidecar() {
        return hasSideCar;
    }

    public void setHasSidecar(Boolean hasSidecar) {
        this.hasSideCar = hasSidecar;
    }

    @Override
    void displayVehicleDetails() {
        System.out.println("Car ID : " + this.getVehicleId() + " Model : " + this.getModel() + " From : " + this.getYear() + " Has side car? : " + this.getHasSidecar() );
    }
}
