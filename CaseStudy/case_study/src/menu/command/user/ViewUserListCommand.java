package menu.command.user;

import data.user.UserDataList;
import menu.command.Command;
import menu.itemList.ActiveUserMenu;
import menu.itemList.EditorProductMenu;

public class ViewUserListCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Here's a list of user \n");
        for(int i = 0; i < UserDataList.getInstance().getUserList().size(); i++ ){

            System.out.println(i + ". " +UserDataList.getInstance().getUserList().get(i));
        }
        System.out.println(" ");
        EditorProductMenu editorProductMenu = new EditorProductMenu();
        editorProductMenu.navigate();
    }
}
