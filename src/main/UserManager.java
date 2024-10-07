package main;

import models.Admin;
import models.Customer;
import models.User;
import services.UserServices;

import java.util.ArrayList;
import java.util.Scanner;

import static services.UserServices.users;

public class UserManager {
    static Scanner input = new Scanner(System.in);
    // Initialize the list of users
    public static ArrayList<User> users = new ArrayList<>();


    public static void main(String[] args) {
        // declaration variables
        int choice;

        // display the menu of user manager
        do{
            System.out.println("<-> <-> User Manager <-> <-> ");
            System.out.println("1) Add User");
            System.out.println("2) Remove User");
            System.out.println("3) Display User By ID");
            System.out.println("4) Find User By ID");
            System.out.println("0) Exit");
            // input the choice of user
            do {
                System.out.print("What do you want? : ");
                choice = input.nextInt();
            }while(choice<0 || choice>4);

            switch(choice) {
                case 1:
                    System.out.println("<-> Add User <-> ");
                    UserServices.addUser(users);
                    break;
                case 2:
                    System.out.println("<-> Remove User <-> ");
                    System.out.print("Enter your Id pls :");
                    int removeId = input.nextInt();
                    UserServices.removeUser(users,removeId);
                    break;
                case 3:
                    System.out.println("<-> Display User By ID <-> ");
                    // for searching if user Id 'displayId'
                    System.out.print("Enter your Id pls :");
                    int displayId = input.nextInt();
                    // exist in the array 'users'
                    User u = UserServices.searchForUserById(users,displayId);
                    // checking about the type of user (from any class)
                    if(u instanceof Customer) { // if the user is Customer
                        Customer c = (Customer) u;
                        c.displayUserDetails();
                    }else if (u instanceof Admin) { // if the user is Admin
                        Admin a = (Admin) u;
                        a.displayUserDetails();
                    }else{
                        System.out.println("From where bro ?");
                    }
                    break;
            }


        }while(choice!=0);
    }
}
