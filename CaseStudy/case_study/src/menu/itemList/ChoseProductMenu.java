package menu.itemList;

import menu.command.product.ChoseProductCommand;
import menu.command.product.RemoveProductCommand;
import menu.command.user.ReturnCommand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoseProductMenu implements Navigator{
    public void displayChoseProductMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu choseProductMenu = new MenuTemplate();
        choseProductMenu.addMenuItem(new MenuItem("Back",new ReturnCommand()));
        choseProductMenu.addMenuItem(new MenuItem("Add to your cart",new ChoseProductCommand()));


        try{
            int choice;
            do{
                choseProductMenu.displayMenu();
                choice = SCANNER.nextInt();
                choseProductMenu.runCommand(choice);
            }while (choice != 0);
        }catch (InputMismatchException e){
            System.out.println("Invalid choice, please try again.");
        }
    }
    @Override
    public void navigate() {
        displayChoseProductMenu();
    }
}
