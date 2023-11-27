package menu.itemList;

import menu.command.ConfirmationAddToCartCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConfirmAddToShopCartMenu implements Navigator{
    public void displayConfirmMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu confirmMenu = new MenuTemplate();
        System.out.println("Are you sure you want to add this product to the cart?");
        confirmMenu.addMenuItem(new MenuItem("No, go back to the product list.", new ReturnCommand()));
        confirmMenu.addMenuItem(new MenuItem("Yes",new ConfirmationAddToCartCommand()));
        try{
            int choice;
            do{
                confirmMenu.displayMenu();
                System.out.println("Enter your choice: ");
                choice = SCANNER.nextInt();
                confirmMenu.runCommand(choice);
            }while (choice < 0 || choice > 2);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again");
            displayConfirmMenu();
        }
    }
    @Override
    public void navigate() {
        displayConfirmMenu();
    }
}
