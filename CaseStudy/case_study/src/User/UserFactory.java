package User;

public class UserFactory {
    public static User createUser(String userID,String userName, String passWord, String userType, String fullName,
                                 String email, String phoneNumber, double balance, boolean isActive){
        switch (userType){
            case "Admin":
                return new Admin(userID,userName,passWord,userType,fullName,email,phoneNumber, balance,isActive);
            case "Seller":
                return new Seller(userID,userName,passWord,userType,fullName,email,phoneNumber,balance,isActive);
            case "Customer":
                return new Customer(userID,userName,passWord,userType,fullName,email,phoneNumber,balance,isActive);
            default:
                System.out.println("Invalid user type, pleas enter again! ");
                return null;
        }
    }
}
