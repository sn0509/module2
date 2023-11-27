package user;

public abstract class User {
    private String userID;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String userType;
    private double balance;
    private boolean isActive;
    private boolean isBan;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }



    public User(String userID, String username, String password, String fullName, String email,
                String phoneNumber,String userType, double balance, boolean isActive, boolean isBan) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
        this.balance = balance;
        this.isActive = isActive;
        this.isBan = isBan;
    }

    public User() {
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isBan() {
        return isBan;
    }

    public void setBan(boolean ban) {
        isBan = ban;
    }

    @Override
    public String toString() {
        return  "username: " + username  +
                ", fullName: " + fullName  +
                ", email: " + email  +
                ", phoneNumber: " + phoneNumber +
                ", userType: " + userType  +
                ", balance: " + balance +
                ", isActive: " + isActive;
    }
}
