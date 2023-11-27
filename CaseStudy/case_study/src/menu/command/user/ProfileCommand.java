package menu.command.user;

import menu.command.Command;
import menu.itemList.ChangeUserInformationMenu;
import menu.itemList.Navigator;
import user.CurrentUser;

public class ProfileCommand implements Command {

    @Override
    public void execute() {
        Navigator profileMenu = new ChangeUserInformationMenu();
        System.out.println(CurrentUser.getCurrentUser());
        profileMenu.navigate();
    }
}
