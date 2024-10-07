package models;

public abstract class User {
    // attributes
    private int userId;
    private String userName;

    // constructor parameter
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // getter & setter
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // abstract method
    abstract void displayUserDetails();

}
