package User;

public class Admin extends User{
    public Admin(String userID,String userName, String passWord,
                 String userType, String fullName, String email,
                 String phoneNumber,double balance, boolean isActive) {
        super(userID, userName, passWord, userType, fullName, email, phoneNumber, balance, isActive);
    }
}
