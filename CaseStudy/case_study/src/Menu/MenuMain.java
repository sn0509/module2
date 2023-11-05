package Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuMain implements Menu {
    List<MenuItem> itemList;
    public MenuMain(){
        this.itemList= new ArrayList<>();
    }
    @Override
    public void addMenu(MenuItem menuItem) {
        itemList.add(menuItem);
    }

    @Override
    public void displayMenu() {
        for (int i = 0; i < itemList.size() ; i++) {
            System.out.println(i + ". " + itemList.get(i).getName());
        }
    }

    @Override
    public void runCommand(int index) {
        if (index > 0 && index < itemList.size()){
            itemList.get(index).getCommand().execute();
        }
        else {
            System.out.println("Invalid Choice, please try again! ");
        }
    }


}
