package menu.itemList;

import menu.command.product.DeActiveProductCommand;
import menu.command.ShowProductCommand;
import menu.command.product.EditorProductCommand;
import menu.command.user.*;

import java.util.Scanner;

public class AdminMenu implements Navigator{
    public void displayAdminMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu adminMenu = new MenuTemplate();
        adminMenu.addMenuItem(new MenuItem("Logout", new LogoutCommand()));
        adminMenu.addMenuItem(new MenuItem("Profile", new ProfileCommand()));
        adminMenu.addMenuItem(new MenuItem("Show the products", new ShowProductCommand()));
        adminMenu.addMenuItem(new MenuItem("Search product", new ShowProductCommand()));
        adminMenu.addMenuItem(new MenuItem("Check shop cart", new CheckShopCartCommand()));
        adminMenu.addMenuItem(new MenuItem("Recharge to wallet", new RechargeCommand()));
        adminMenu.addMenuItem(new MenuItem("Your products manager", new ProductManagerCommand()));
        adminMenu.addMenuItem(new MenuItem("View user list", new ViewUserListCommand()));
        try {
            int choice;
            do {
                adminMenu.displayMenu();
                choice = SCANNER.nextInt();
                adminMenu.runCommand(choice);
                System.out.println("Enter yor choice.");
            } while (choice != 0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid choice, please try again! ");
            displayAdminMenu();
        }
    }
    @Override
    public void navigate() {
    displayAdminMenu();
    }
}
