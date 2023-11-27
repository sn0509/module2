package userManager.register;

public class GetUserType {
    public String getUserType(int userChoice){
        switch (userChoice){
            case 1:
                return "Customer";
            case 2:
                return "Seller";
            default:
                return null;
        }
    }


}