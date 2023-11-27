package menu.itemList;

import java.util.ArrayList;
import java.util.List;

public class MenuTemplate implements Menu {
    private List<MenuItem> menuItems = new ArrayList<>();


    @Override
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public void displayMenu() {
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + ". " + menuItems.get(i).getName());
        }
    }

    @Override
    public void runCommand(int choice) {
        if (choice >= 0 && choice < menuItems.size()){
            menuItems.get(choice).getCommand().execute();
        }else{
            System.out.println("Invalid choice, please try again");
        }
    }
}
