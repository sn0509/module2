package User;

public class Seller extends User{
    public Seller(String userID, String userName, String passWord,
                  String userType, String fullName,
                  String email, String phoneNumber, double balance, boolean isActive) {
        super( userID,userName, passWord, userType, fullName, email, phoneNumber, balance, isActive);
    }
}
