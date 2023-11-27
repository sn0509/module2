package menu.command;

import menu.itemList.ViewProductMenu;

public class ShowProductCommand implements Command{
    @Override
    public void execute() {
        ViewProductMenu viewProductMenu = new ViewProductMenu();
        viewProductMenu.navigate();
    }

}
