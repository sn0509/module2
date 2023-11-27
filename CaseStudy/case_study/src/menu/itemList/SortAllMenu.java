package menu.itemList;

import menu.command.product.AllSortAscendingCommand;
import menu.command.product.AllSortDescendingCommand;
import menu.command.product.ChoseProductCommand;
import menu.command.user.CheckShopCartCommand;
import menu.command.user.ReturnCommand;
import user.CurrentUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortAllMenu implements Navigator{
    public void displaySortMenu(){
        Scanner SCANNER = new Scanner(System.in);
        Menu sortMenu = new MenuTemplate();
        sortMenu.addMenuItem(new MenuItem("Back", new ReturnCommand()));
        sortMenu.addMenuItem(new MenuItem("Sort by ascending price",new AllSortAscendingCommand()));
        sortMenu.addMenuItem(new MenuItem("Sort by descending price",new AllSortDescendingCommand()));
        if(CurrentUser.getCurrentUser()!=null) {
            sortMenu.addMenuItem(new MenuItem("Chose product", new ChoseProductCommand()));
            sortMenu.addMenuItem(new MenuItem("Check shop cart", new CheckShopCartCommand()));
        }
        try{
            int choice;
            do {
                sortMenu.displayMenu();
                System.out.println("Enter your choice.");
                choice = SCANNER.nextInt();
                sortMenu.runCommand(choice);
            }while(choice != 0);
        }catch(InputMismatchException e){
            System.out.println("Invalid choice, please try again.");
            displaySortMenu();
        }
    }
    @Override
    public void navigate() {
        displaySortMenu();
    }
}
