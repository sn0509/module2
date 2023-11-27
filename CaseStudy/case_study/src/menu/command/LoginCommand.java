package menu.command;

import userManager.UserManager;

public class LoginCommand implements Command{
    @Override
    public void execute() {
        UserManager userManager = new UserManager();
        userManager.login();

    }


}
