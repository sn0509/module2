package menu.command.user;

import menu.command.Command;
import menu.itemList.HomePage;
import userManager.UserManager;

public class LogoutCommand implements Command {
    @Override
    public void execute() {
        UserManager.logout();
        System.out.println("Logout successful \n");
    }
}
