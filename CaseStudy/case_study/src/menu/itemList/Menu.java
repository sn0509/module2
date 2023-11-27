package menu.itemList;

import java.util.ArrayList;
import java.util.List;

public interface Menu {
     void addMenuItem(MenuItem menuItem);
     void displayMenu();
     void runCommand(int choice);
}
