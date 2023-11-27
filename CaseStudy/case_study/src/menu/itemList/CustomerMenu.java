package menu.itemList;

import menu.command.*;
import menu.command.user.CheckShopCartCommand;
import menu.command.user.LogoutCommand;
import menu.command.user.ProfileCommand;
import menu.command.user.RechargeCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMenu implements Navigator {

    private void displayCustomerMenu() {
        Scanner SCANNER = new Scanner(System.in);
        Menu customerLoginMenu = new MenuTemplate();
        customerLoginMenu.addMenuItem(new MenuItem("Logout", new LogoutCommand()));
        customerLoginMenu.addMenuItem(new MenuItem("Profile", new ProfileCommand()));
        customerLoginMenu.addMenuItem(new MenuItem("View product list", new ShowProductCommand()));
        customerLoginMenu.addMenuItem(new MenuItem("Search (seller or product)", new SearchCommand()));
        customerLoginMenu.addMenuItem(new MenuItem("Check shop cart", new CheckShopCartCommand()));
        customerLoginMenu.addMenuItem(new MenuItem("Recharge to wallet", new RechargeCommand()));
        try {


            int choice;
            do {
                customerLoginMenu.displayMenu();
                choice = SCANNER.nextInt();
                customerLoginMenu.runCommand(choice);
            } while (choice != 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again!");
            displayCustomerMenu();
        }
    }
    @Override
    public void navigate() {
        displayCustomerMenu();
    }

}
