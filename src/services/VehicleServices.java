package services;

import models.Car;
import models.Motocycle;
import models.Truck;
import models.Vehicle;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class VehicleServices {
    static final Scanner input = new Scanner(System.in);
    static ArrayList<Vehicle> vehicles;

    public static void addVehicle() {
        Vehicle vehicle;
        // input vehicle attributes
        System.out.print("Vehicle ID: ");
        int vId = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Vehicle Name: ");
        String name = input.nextLine();

        System.out.print("Vehicle Model: ");
        String model = input.nextLine();

        System.out.print("Vehicle Year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume the newline character

        // Choose type of vehicle
        System.out.println("What's the type of vehicle you want to add?\nCar | Motorcycle | Truck");
        String type = input.nextLine().toLowerCase(Locale.ROOT);

        switch (type) {
            case "car":
                System.out.print("Number of doors: ");
                int numDoors = input.nextInt();
                input.nextLine(); // Consume the newline character
                vehicle = new Car(vId, name, model, year, numDoors);
                break;
            case "motorcycle":
                System.out.print("Does this motorcycle have a sidecar? (true or false): ");
                boolean hasSideCar = input.nextBoolean();
                input.nextLine(); // Consume the newline character
                vehicle = new Motocycle(vId, name, model, year, hasSideCar);
                break;
            case "truck":
                System.out.print("Load capacity of your truck: ");
                int loadCapacity = input.nextInt();
                input.nextLine(); // Consume the newline character
                vehicle = new Truck(vId, name, model, year, loadCapacity);
                break;
            default:
                System.out.println("Invalid vehicle type");
                return; // Exit the method
        }

        // Check if the vehicle ID is unique before adding
        if (!isVehicleIdUnique(vId)) { // Ensure to implement this method
            vehicles.add(vehicle);
            System.out.println("Vehicle added successfully");
        } else {
            System.out.println("Vehicle ID already exists. Please use a unique ID.");
        }
    }

    // A method to check if vehicle ID is unique
    private static boolean isVehicleIdUnique(int vId) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vId) { // Assuming getVehicleId() returns an int
                return false;
            }
        }
        return true;
    }

    // this function search for vehicle if exist or not
    public static int findVehicleByID(ArrayList<Vehicle> vehicles, int x) {
        for (Vehicle v : vehicles) {
            if(v.getVehicleId() == x){
                return v.getVehicleId();
            }
        }
        return -1;
    }

    public static void displayVehiclesById(ArrayList<Vehicle> vehicles,int x) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == x){
                System.out.println("Vehicle exist.\n ID: " + v.getVehicleId() + " Name: " + v.getVehicleName() + "Year: " + v.getYear() + "Model: " + v.getModel());
                return;
            }
        }
        System.out.println("Vehicle  not found");
    }

    public static ArrayList<Vehicle> removeVehicle(ArrayList<Vehicle> vehicles, int x){
        // we create temporary variable 'tmp' to store the value of search function
        int tmp = findVehicleByID(vehicles,x);
        if (tmp != -1){ // now let's check about the return value
            vehicles.remove(tmp); // if exist and founded remove it
            return vehicles;
        }
        return null;
    }


}
