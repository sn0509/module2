package User;

public class Seller extends User{
    public Seller(int userId, String userName, String passWord, UserType userType, String fullName,
                  String email, String phoneNumber, boolean isActive) {
        super(userId, userName, passWord, userType, fullName, email, phoneNumber, isActive);
    }
}
