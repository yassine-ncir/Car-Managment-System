package services;

import models.Admin;
import models.Customer;
import models.User;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserServices {
    static final Scanner input = new Scanner(System.in);
    static Random random = new Random();
    public static ArrayList<User> users;

    // removeUser : ArrayList<User>

    public static boolean isUniqueId(ArrayList<User> users,int id) {
        for (User u : users) {
            if (u.getUserId() == id) {
                return false; // If the ID is found, it is not unique
            }
        }
        return true; // If the ID is not found, it is unique
    }

    public static void addUser(ArrayList<User> users){
        // declaration
        User user;

        System.out.print("Enter name: ");
        String name = input.nextLine();
        // input userid with unique id
        int userId;
        do {
            userId = random.nextInt(1000); // Generate a random ID between 0 and 999
        } while (!isUniqueId(users,userId)); // Repeat if the ID is not unique

        System.out.println("Who are you? Admin | Customer ");
        String userType = input.nextLine().toLowerCase();

        switch (userType) {
            case "admin":
                System.out.print("Enter your role :");
                String role = input.nextLine();
                user = new Admin(userId, name, role);
                break;

            case "customer":
                System.out.print("Enter adress :");
                String adress = input.nextLine();
                input.nextLine(); // consume new line
                System.out.print("Enter phone number :");
                int phoneNumber = Integer.parseInt(input.nextLine()); // Parse input to avoid newline issue
                user = new Customer(userId, name, adress, phoneNumber);
                break;
            default:
                System.out.println("Invalid user type");
                return;// Return null if user type is invalid
        }
        // Add user to the list of users
        users.add(user);
        System.out.println(user.getUserName()+" added successfully with ID: " + userId);

    }

    public static User searchForUserById(ArrayList<User> users, int id){
        for (User u : users) {
            if (u.getUserId() == id) {
                System.out.println("User found with ID: " + u.getUserId());
                return u;
            }
        }
        return null;
    }

    public static ArrayList<User> removeUser(ArrayList<User> users, int id) {
        User u = searchForUserById(users,id); // search for user with id
        if (u!=null){ // if existe
            users.remove(u); // remove it
            System.out.println("User removed successfully with ID: " + u.getUserId());
        }else{
            System.out.println("User not found");
        }
        return users;
    }

}
