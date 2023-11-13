package User;

public abstract class User {
    private String userID;
    private String userName;
    private String passWord;
    private String confirmPassword;
    private String userType;
    private String fullName;
    private String email;
    private String phoneNumber;
    private double balance;
    private boolean isActive;



    public User( String userID,String userName, String passWord, String userType, String fullName, String email,
                String phoneNumber, double balance, boolean isActive) {
        this.userID=userID;
        this.userName = userName;
        this.passWord = passWord;
        this.userType = userType;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.isActive = isActive;
    }

    public String getUserId() {
        return userID;
    }

    public void setUserId(String userId) {
        this.userID = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return  "userId=" + userID +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userType=" + userType +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", blance =' " + balance + '\'' +
                ", isActive=" + isActive
               ;
    }
}
