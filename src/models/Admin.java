package models;

public class Admin extends User{
    // attributes
    private String role;

    // constructor parameter
    public Admin(int userId, String userName, String role) {
        super(userId, userName);
        this.role = role;
    }

    // getter & setter
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void displayUserDetails(){
        System.out.println("Admin ID: " + this.getUserId() + ", Name: " + this.getUserName()  +", Role: " + this.getRole());
    }
}
