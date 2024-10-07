package models;

public class Customer extends User {
    // attributes
    private String adress;
    private int phoneNumber;

    // constructor parameter
    public Customer(int userId, String userName, String adress, int phoneNumber) {
        super(userId, userName);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    // getter & setter
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayUserDetails() {
        System.out.println("Customer ID " + this.getUserId() + " Name " + this.getUserName() + " Address " + this.getAdress() + " Phone Number " + this.getPhoneNumber() );
    }
}
