package menu.itemList;

import menu.command.ShowProductCommand;
//import menu.command.seller.ProductsManagerCommand;
import menu.command.user.*;

import java.util.Scanner;

public class SellerMenu implements Navigator{
    private void displaySellerMenu() {
        Scanner SCANNER = new Scanner(System.in);
        Menu sellerLoginMenu = new MenuTemplate();
        sellerLoginMenu.addMenuItem(new MenuItem("Logout", new LogoutCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Profile", new ProfileCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Show the products", new ShowProductCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Search product", new ShowProductCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Check shop cart", new CheckShopCartCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Recharge to wallet", new RechargeCommand()));
        sellerLoginMenu.addMenuItem(new MenuItem("Your products manager", new ProductManagerCommand()));
        try {
            int choice;
            do {
                sellerLoginMenu.displayMenu();
                choice = SCANNER.nextInt();
                sellerLoginMenu.runCommand(choice);
            } while (choice != 0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid choice, please try again! ");
            displaySellerMenu();
        }
    }
    @Override
    public void navigate() {
        displaySellerMenu();
    }
}
