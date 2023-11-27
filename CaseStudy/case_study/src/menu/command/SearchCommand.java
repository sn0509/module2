package menu.command;

import menu.itemList.SearchMenu;

public class SearchCommand implements Command{
    @Override
    public void execute() {
        SearchMenu searchMenu = new SearchMenu();
        searchMenu.navigate();
    }
}
