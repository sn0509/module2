import User.User;
import User.UserFactory;
import User.UserID;
import User.UserType;
import customer_data.DataManager;

import java.util.Scanner;

public class UserManager {
    static Scanner SCANNER =new Scanner(System.in);
    public  void userRegister(){
        DataManager dataManager = new DataManager();
        dataManager.fileReader();
        String userType="";
        String userID= UserID.getRandomUserID(8);

        System.out.println("Enter username: ");
        String userName= SCANNER.nextLine();

        System.out.println("Enter password: ");
        String password=SCANNER.nextLine();

//        System.out.println("Enter your password again");
//        String confirmPassword =SCANNER.nextLine();
        System.out.println("""
                User Type:
                1.Seller.
                2.Customer.
                """);
        String input= SCANNER.nextLine();
        System.out.println(input);
        if (input.equals("1")){
            userType = "Seller";
        }else if (input.equals("2")){
            userType="Customer";
        }else {
            System.out.println("Invalid choice");
        }

        System.out.println("Enter your full name");
        String fullName=SCANNER.nextLine();

        System.out.println("Enter your Email");
        String email =SCANNER.nextLine();

        System.out.println("Enter your phone number");
        String phoneNumber= SCANNER.nextLine();

        double balance=0;

        boolean isAvctive= true;

        User user = UserFactory.createUser(userID,userName,password,userType,fullName,
                email,phoneNumber, balance, isAvctive);
        dataManager.userList.add(user);
    }
    public static void userLogin(){
        System.out.println("Enter your username: ");
        String userName= SCANNER.nextLine();
        System.out.println("Enter your password: ");
        String password = SCANNER.nextLine();
    }

}
