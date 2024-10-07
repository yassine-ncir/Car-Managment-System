package main;

import models.Vehicle;
import services.VehicleServices;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class VehicleManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();  // Initialize the list of vehicles

        int choice;

        do {
            System.out.println("<-> <-> Vehicle Manager <-> <-> ");
            System.out.println("1) Add Vehicle");
            System.out.println("2) Remove Vehicle");
            System.out.println("3) Find Vehicle By ID");
            System.out.println("4) Display Vehicle By ID");
            System.out.println("0) Exit");
            System.out.print("What do you want? : ");

            // Ensure the input is valid
            while (!input.hasNextInt()) {
                System.out.print("Please enter a valid option (0-4): ");
                input.next();
            }
            choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("<-> Add Vehicle <-> ");
                    VehicleServices.addVehicle(); // Pass scanner and list
                    break;

                case 2:
                    System.out.println("<-> Remove Vehicle <-> ");
                    System.out.print("Enter Vehicle ID to remove: ");
                    int removeId = input.nextInt();
                    input.nextLine(); // consume the newline character
                    ArrayList<Vehicle> removedVehicle = VehicleServices.removeVehicle(vehicles, removeId);
                    if (removedVehicle != null) {
                        System.out.println("Your vehicle has been removed.");
                    } else {
                        System.out.println("Vehicle ID not found.");
                    }
                    break;

                case 3:
                    System.out.println("<-> Find Vehicle By ID <-> ");
                    System.out.print("Enter Vehicle ID to find: ");
                    int findId = input.nextInt();
                    input.nextLine(); // consume the newline character
                    int index = VehicleServices.findVehicleByID(vehicles, findId);
                    if (index != -1) {
                        System.out.println("Your vehicle named: " + vehicles.get(index).getVehicleName() + " has been found.");
                    } else {
                        System.out.println("Vehicle ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("<-> Display Vehicle <-> ");
                    System.out.print("Enter Vehicle ID to find: ");
                    int displayId = input.nextInt();
                    input.nextLine(); // consume the newline character
                    VehicleServices.displayVehiclesById(vehicles, displayId);
                    break;

                case 0:
                    System.out.println("Exiting Vehicle Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Your choice is not a valid option. Please try again.");
                    break;
            }

        } while (choice != 0);

        input.close(); // Close the scanner when done
    }
}
