package User;

public class UserFactory {
    public User createUser(int userId, String userName, String passWord, UserType userType, String fullName,
                                 String email, String phoneNumber, boolean isActive){
        switch (userType){
            case  ADMIN:
                return new Admin(userId,userName,passWord,userType,fullName,email,phoneNumber,isActive);
            case SELLER:
                return new Seller(userId,userName,passWord,userType,fullName,email,phoneNumber,isActive);
            case CUSTOMER:
                return new Customer(userId,userName,passWord,userType,fullName,email,phoneNumber,isActive);
            default:
                System.out.println("Invalid user type, pleas enter again! ");
                return null;
        }
    }
}
