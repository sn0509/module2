package menu.command;

import userManager.UserManager;

public class RegisterCommand implements Command{
    @Override
    public void execute() {
        UserManager.register();
    }


}
