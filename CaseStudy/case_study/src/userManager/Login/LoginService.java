package userManager.Login;

import data.user.UserReaderData;
import menu.itemList.AdminMenu;
import menu.itemList.CustomerMenu;
import menu.itemList.SellerMenu;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import user.CurrentUser;
import user.User;

public class LoginService<T extends User> {
    private User currentUser;
    private UserReaderData dataReader = new UserReaderData();
    private LoginInput input = new LoginInput();
    private String username = input.getUsername();
    private String password = input.getPassword();
    private final BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    private PasswordSecurity passwordSecurity = new PasswordSecurity();

    public User getCurrenUser() {
        for (User user : dataReader.readDataFromFile()) {
            if (username.equalsIgnoreCase(user.getUsername()) && passwordSecurity.isMatch(password,user.getPassword())) {
                if (user.isActive() && !user.isBan()) {
                    CurrentUser.setCurrentUser(user);
                    currentUser = CurrentUser.getCurrentUser();
                    System.out.println("Welcome  " + currentUser.getUsername());
                    if(user.getUserType().equals("Customer")){
                        CustomerMenu customerMenu = new CustomerMenu();
                        customerMenu.navigate();
                    }else if(user.getUserType().equals("Seller")){
                        SellerMenu sellerMenu = new SellerMenu();
                        sellerMenu.navigate();
                    }else {
                        AdminMenu adminMenu = new AdminMenu();
                        adminMenu.navigate();
                    }
                    return currentUser;
                } else {
                    System.out.println("Your account has been disabled or locked. Please contact the " +
                            "administrator for assistance. ");
                    return null;
                }
            }
        }
        System.out.println("Your account does not exist or the password is incorrect. \n");
        return null;
    }
}

