package User;

public class Customer extends User{
    public Customer(String userID, String userName, String passWord,
                    String userType, String fullName,
                    String email, String phoneNumber, double balance, boolean isActive) {
        super(userID, userName, passWord, userType, fullName, email, phoneNumber, balance, isActive);
    }

    @Override
    public String toString() {
        return "Customer{ " + super.toString() + "}";
    }
}
