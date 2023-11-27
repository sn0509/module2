package menu.itemList;


import menu.command.product.PaymentCommand;

import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopCartMenu implements Navigator{
    public void displayShopCartMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu shopCartMenu = new MenuTemplate();
        shopCartMenu.addMenuItem(new MenuItem("Back", new ReturnCommand()));
        shopCartMenu.addMenuItem(new MenuItem("Payment for products", new PaymentCommand()));
        try{
            int choice;
            do{
                shopCartMenu.displayMenu();
                System.out.println("Enter your choice.");
                choice = SCANNER.nextInt();
                shopCartMenu.runCommand(choice);
            }while (choice < 0 || choice > 1);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again.");
            displayShopCartMenu();
        }
    }
    @Override
    public void navigate() {
        displayShopCartMenu();
    }
}
