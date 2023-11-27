package userManager;

import user.CurrentUser;
import userManager.Login.LoginService;
import userManager.register.RegisterService;

public class UserManager {
    private static RegisterService userRegisterService = new RegisterService();
    private LoginService userLogin = new LoginService();


    public static void register (){
        userRegisterService.register();
    }

    public void login(){
        userLogin.getCurrenUser();
    }
    public static void logout(){
        CurrentUser.setCurrentUser(null);
    }
}
